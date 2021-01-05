package com.myproject.myapi.model;

public class CsvDetails {
    private String apiCallData;
    private String apiKey;
    private String apiValue;

    public CsvDetails(String apiCallData, String apiKey, String apiValue) {
        this.apiCallData = apiCallData;
        this.apiKey = apiKey;
        this.apiValue = apiValue;
    }

    public CsvDetails() {
    }

    public String getApiCallData() {
        return apiCallData;
    }

    public void setApiCallData(String apiCallData) {
        this.apiCallData = apiCallData;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiValue() {
        return apiValue;
    }

    public void setApiValue(String apiValue) {
        this.apiValue = apiValue;
    }

    public String toCSVString(){
        return this.apiCallData+ "," +this.apiKey+ "," +this.apiValue;
    }
}
