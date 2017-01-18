
package com.weatherAPI;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TxtForecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("forecastday")
    @Expose
    private List<Forecastday> forecastday = null;

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    public TxtForecast withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 
     * @return
     *     The forecastday
     */
    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    /**
     * 
     * @param forecastday
     *     The forecastday
     */
    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    public TxtForecast withForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
        return this;
    }

}
