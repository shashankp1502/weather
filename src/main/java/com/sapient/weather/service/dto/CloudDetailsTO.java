package com.sapient.weather.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudDetailsTO {

    @JsonProperty("main")
    private String  cloudStatus;

    @JsonProperty("description")
    private String cloudDescription;

    public String getCloudStatus() {
        return cloudStatus;
    }

    public void setCloudStatus(String cloudStatus) {
        this.cloudStatus = cloudStatus;
    }

    public String getCloudDescription() {
        return cloudDescription;
    }

    public void setCloudDescription(String cloudDescription) {
        this.cloudDescription = cloudDescription;
    }
}
