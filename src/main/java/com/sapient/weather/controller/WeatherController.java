package com.sapient.weather.controller;

import com.sapient.weather.service.WeatherService;
import com.sapient.weather.service.dto.ResponseTO;
import com.sapient.weather.service.dto.WeatherDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast")
    public ArrayList<ResponseTO> getWeatherForecast(){
        return weatherService.getWeatherDetails();

    }
}
