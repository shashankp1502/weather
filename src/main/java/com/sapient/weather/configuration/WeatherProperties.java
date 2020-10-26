package com.sapient.weather.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "constant")
public class WeatherProperties {

    private String weatherUrlPrefix;

    private String weatherUrlSuffix;

    private String rainAdvice;

    private String sunnyDayAdvice;

    private String clearCloudAdvice;

    public String getWeatherUrlPrefix() {
        return weatherUrlPrefix;
    }

    public void setWeatherUrlPrefix(String weatherUrlPrefix) {
        this.weatherUrlPrefix = weatherUrlPrefix;
    }

    public String getWeatherUrlSuffix() {
        return weatherUrlSuffix;
    }

    public void setWeatherUrlSuffix(String weatherUrlSuffix) {
        this.weatherUrlSuffix = weatherUrlSuffix;
    }

    public String getRainAdvice() {
        return rainAdvice;
    }

    public void setRainAdvice(String rainAdvice) {
        this.rainAdvice = rainAdvice;
    }

    public String getSunnyDayAdvice() {
        return sunnyDayAdvice;
    }

    public void setSunnyDayAdvice(String sunnyDayAdvice) {
        this.sunnyDayAdvice = sunnyDayAdvice;
    }

    public String getClearCloudAdvice() {
        return clearCloudAdvice;
    }

    public void setClearCloudAdvice(String clearCloudAdvice) {
        this.clearCloudAdvice = clearCloudAdvice;
    }
}
