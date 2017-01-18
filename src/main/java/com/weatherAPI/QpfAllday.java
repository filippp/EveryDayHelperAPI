
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QpfAllday {

    @SerializedName("in")
    @Expose
    private Double in;
    @SerializedName("mm")
    @Expose
    private Integer mm;

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

    public QpfAllday withIn(Double in) {
        this.in = in;
        return this;
    }

    /**
     * 
     * @return
     *     The mm
     */
    public Integer getMm() {
        return mm;
    }

    /**
     * 
     * @param mm
     *     The mm
     */
    public void setMm(Integer mm) {
        this.mm = mm;
    }

    public QpfAllday withMm(Integer mm) {
        this.mm = mm;
        return this;
    }

}
