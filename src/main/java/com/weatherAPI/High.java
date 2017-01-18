
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class High {

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;

    /**
     * 
     * @return
     *     The fahrenheit
     */
    public String getFahrenheit() {
        return fahrenheit;
    }

    /**
     * 
     * @param fahrenheit
     *     The fahrenheit
     */
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public High withFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
        return this;
    }

    /**
     * 
     * @return
     *     The celsius
     */
    public String getCelsius() {
        return celsius;
    }

    /**
     * 
     * @param celsius
     *     The celsius
     */
    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public High withCelsius(String celsius) {
        this.celsius = celsius;
        return this;
    }

}
