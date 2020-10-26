package com.sapient.weather.service.dto;

import com.sapient.weather.configuration.WeatherProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class ResponseTO {

    private long date;

    private double maximumTemperature;

    private double minimumTemperature;

    private String advice;

    public ResponseTO(long date, double maximumTemperature, double minimumTemperature, String advice) {
        this.date = date;
        this.maximumTemperature = maximumTemperature;
        this.minimumTemperature = minimumTemperature;
        this.advice = advice;
    }

    public static ResponseTO createFrom(WeatherListTO weatherListTO) {
        String advice = "Clear Clouds";
        for(CloudDetailsTO cloudDetailsTO : weatherListTO.getCloudDetailsTO()){
            if("Rain".equals(cloudDetailsTO.getCloudStatus())) {
                advice = "Carry Umbrella";
            }
        }
        if(weatherListTO.getWeatherTemperatureTO().getTemperature() > 313.15){
            advice = "Use Sunscreen Lotion";
        }
        return new ResponseTO(weatherListTO.getDateAndTime(), weatherListTO.getWeatherTemperatureTO().getMaxTemp(),
                weatherListTO.getWeatherTemperatureTO().getMinTemp(), advice);
    }

    public long getDate() {
        return date;
    }
    public void setDate(long date) {
        this.date = date;
    }

    public double getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(double maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public double getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(double minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
