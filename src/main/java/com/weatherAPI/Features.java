
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features {

    @SerializedName("forecast")
    @Expose
    private Integer forecast;

    /**
     * 
     * @return
     *     The forecast
     */
    public Integer getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }

    public Features withForecast(Integer forecast) {
        this.forecast = forecast;
        return this;
    }

}
