package com.sapient.weather.service;

import com.sapient.weather.service.dto.CloudDetailsTO;
import com.sapient.weather.service.dto.ResponseTO;
import com.sapient.weather.service.dto.WeatherDetails;
import com.sapient.weather.service.dto.WeatherListTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class WeatherService {

    private RestTemplate restTemplate = new RestTemplate();

    public ArrayList<ResponseTO> getWeatherDetails(){
        WeatherDetails weatherResponseBody = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/forecast?q=London&appid=99a643c741dcdcd0121f991fbb698153", WeatherDetails.class);
        ArrayList<ResponseTO> responseTOS =  new ArrayList<>();

        for(WeatherListTO weatherListTO : weatherResponseBody.getWeatherListTOS()){
            ResponseTO responseTO = new ResponseTO();
            for(CloudDetailsTO cloudDetailsTO : weatherListTO.getCloudDetailsTO()){
                if("Rain".equals(cloudDetailsTO.getCloudStatus())){
                    responseTO.setAdvice("Carry Umbrella");
                } else {
                    responseTO.setAdvice("Clear Clouds");
                }
            }

            if(weatherListTO.getWeatherTemperatureTO().getTemperature() > 313.15){
                responseTO.setAdvice("Use Sunscreen Lotion");
            }

            responseTO.setDate(weatherListTO.getDateAndTime());
            responseTO.setMinimumTemperature(weatherListTO.getWeatherTemperatureTO().getMinTemp());
            responseTO.setMaximumTemperature(weatherListTO.getWeatherTemperatureTO().getMaxTemp());
            responseTOS.add(responseTO);
        }

        return responseTOS;
    }

}
