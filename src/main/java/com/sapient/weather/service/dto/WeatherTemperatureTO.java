package com.sapient.weather.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherTemperatureTO {

    @JsonProperty("temp")
    private double temperature;

    @JsonProperty("temp_min")
    private double minTemp;

    @JsonProperty("temp_max")
    private double maxTemp;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
}
