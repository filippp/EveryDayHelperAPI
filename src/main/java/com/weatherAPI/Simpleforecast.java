
package com.weatherAPI;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Simpleforecast {

    @SerializedName("forecastday")
    @Expose
    private List<Forecastday_> forecastday = null;

    /**
     * 
     * @return
     *     The forecastday
     */
    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    /**
     * 
     * @param forecastday
     *     The forecastday
     */
    public void setForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
    }

    public Simpleforecast withForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
        return this;
    }

}
