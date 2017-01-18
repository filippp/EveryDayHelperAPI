
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.concurrent.locks.Condition;

public class Example {

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("forecast")
    @Expose
    private Forecast forecast;

    /**
     * 
     * @return
     *     The response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    public Example withResponse(Response response) {
        this.response = response;
        return this;
    }

    /**
     * 
     * @return
     *     The forecast
     */
    public Forecast getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Example withForecast(Forecast forecast) {
        this.forecast = forecast;
        return this;
    }

    @Override
    public String toString(){
        return "Forecast weather for " + getForecast().getSimpleforecast().getForecastday().get(0).getDate() + " AND POp chance is " +
                getForecast().getSimpleforecast().getForecastday().get(0).getPop() + "%";
    }

}
