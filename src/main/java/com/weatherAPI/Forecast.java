
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("txt_forecast")
    @Expose
    private TxtForecast txtForecast;
    @SerializedName("simpleforecast")
    @Expose
    private Simpleforecast simpleforecast;

    /**
     * 
     * @return
     *     The txtForecast
     */
    public TxtForecast getTxtForecast() {
        return txtForecast;
    }

    /**
     * 
     * @param txtForecast
     *     The txt_forecast
     */
    public void setTxtForecast(TxtForecast txtForecast) {
        this.txtForecast = txtForecast;
    }

    public Forecast withTxtForecast(TxtForecast txtForecast) {
        this.txtForecast = txtForecast;
        return this;
    }

    /**
     * 
     * @return
     *     The simpleforecast
     */
    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    /**
     * 
     * @param simpleforecast
     *     The simpleforecast
     */
    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
    }

    public Forecast withSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
        return this;
    }

}
