package com.sapient.weather.service;

import com.sapient.weather.configuration.WeatherProperties;
import com.sapient.weather.service.dto.ResponseTO;
import com.sapient.weather.service.dto.WeatherDetails;
import com.sapient.weather.service.dto.WeatherListTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class WeatherService {

    @Autowired
    private WeatherProperties weatherProperties;

    private RestTemplate restTemplate = new RestTemplate();

    public ArrayList<ResponseTO> getWeatherDetails(String location){
        WeatherDetails weatherResponseBody = restTemplate.getForObject(weatherProperties.getWeatherUrlPrefix()
                + location +"&"+ weatherProperties.getWeatherUrlSuffix(), WeatherDetails.class);
        ArrayList<ResponseTO> responseTOS =  new ArrayList<>();
        for(WeatherListTO weatherListTO : weatherResponseBody.getWeatherListTOS()){
            ResponseTO responseTO = ResponseTO.createFrom(weatherListTO);
            responseTOS.add(responseTO);
        }
        return responseTOS;
    }
}
