package com.sapient.weather.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class WeatherDetails {

    @JsonProperty("list")
    private ArrayList<WeatherListTO> weatherListTOS;

    public ArrayList<WeatherListTO> getWeatherListTOS() {
        return weatherListTOS;
    }

    public void setWeatherListTOS(ArrayList<WeatherListTO> weatherListTOS) {
        this.weatherListTOS = weatherListTOS;
    }
}
