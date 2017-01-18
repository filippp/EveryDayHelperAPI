
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SnowNight {

    @SerializedName("in")
    @Expose
    private Double in;
    @SerializedName("cm")
    @Expose
    private Double cm;

    /**
     * 
     * @return
     *     The in
     */
    public Double getIn() {
        return in;
    }

    /**
     * 
     * @param in
     *     The in
     */
    public void setIn(Double in) {
        this.in = in;
    }

    public SnowNight withIn(Double in) {
        this.in = in;
        return this;
    }

    /**
     * 
     * @return
     *     The cm
     */
    public Double getCm() {
        return cm;
    }

    /**
     * 
     * @param cm
     *     The cm
     */
    public void setCm(Double cm) {
        this.cm = cm;
    }

    public SnowNight withCm(Double cm) {
        this.cm = cm;
        return this;
    }

}
