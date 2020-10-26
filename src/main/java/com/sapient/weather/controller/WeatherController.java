package com.sapient.weather.controller;

import com.sapient.weather.exception.LocationNotFoundException;
import com.sapient.weather.service.WeatherService;
import com.sapient.weather.service.dto.ResponseTO;
import com.sapient.weather.service.dto.WeatherDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast/{location}")
    public ArrayList<ResponseTO> getWeatherForecast(@PathVariable String location)  {
            return weatherService.getWeatherDetails(location);
    }

    @ExceptionHandler
    public void handleNotFoundData(LocationNotFoundException exception, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value(), "Location Not Found");
    }

}
