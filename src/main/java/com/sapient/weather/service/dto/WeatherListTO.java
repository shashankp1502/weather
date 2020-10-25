package com.sapient.weather.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class WeatherListTO {

    @JsonProperty("dt")
    private long dateAndTime;

    @JsonProperty("main")
    private WeatherTemperatureTO weatherTemperatureTO;

    @JsonProperty("weather")
    private ArrayList<CloudDetailsTO> cloudDetailsTO;

    public long getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(long dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public WeatherTemperatureTO getWeatherTemperatureTO() {
        return weatherTemperatureTO;
    }

    public void setWeatherTemperatureTO(WeatherTemperatureTO weatherTemperatureTO) {
        this.weatherTemperatureTO = weatherTemperatureTO;
    }

    public ArrayList<CloudDetailsTO> getCloudDetailsTO() {
        return cloudDetailsTO;
    }

    public void setCloudDetailsTO(ArrayList<CloudDetailsTO> cloudDetailsTO) {
        this.cloudDetailsTO = cloudDetailsTO;
    }
}
