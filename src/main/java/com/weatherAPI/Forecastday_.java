
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecastday_ {

    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("period")
    @Expose
    private Integer period;
    @SerializedName("high")
    @Expose
    private High high;
    @SerializedName("low")
    @Expose
    private Low low;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("skyicon")
    @Expose
    private String skyicon;
    @SerializedName("pop")
    @Expose
    private Integer pop;
    @SerializedName("qpf_allday")
    @Expose
    private QpfAllday qpfAllday;
    @SerializedName("qpf_day")
    @Expose
    private QpfDay qpfDay;
    @SerializedName("qpf_night")
    @Expose
    private QpfNight qpfNight;
    @SerializedName("snow_allday")
    @Expose
    private SnowAllday snowAllday;
    @SerializedName("snow_day")
    @Expose
    private SnowDay snowDay;
    @SerializedName("snow_night")
    @Expose
    private SnowNight snowNight;
    @SerializedName("maxwind")
    @Expose
    private Maxwind maxwind;
    @SerializedName("avewind")
    @Expose
    private Avewind avewind;
    @SerializedName("avehumidity")
    @Expose
    private Integer avehumidity;
    @SerializedName("maxhumidity")
    @Expose
    private Integer maxhumidity;
    @SerializedName("minhumidity")
    @Expose
    private Integer minhumidity;

    /**
     * 
     * @return
     *     The date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public Forecastday_ withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * 
     * @return
     *     The period
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     *     The period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Forecastday_ withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 
     * @return
     *     The high
     */
    public High getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    public void setHigh(High high) {
        this.high = high;
    }

    public Forecastday_ withHigh(High high) {
        this.high = high;
        return this;
    }

    /**
     * 
     * @return
     *     The low
     */
    public Low getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    public void setLow(Low low) {
        this.low = low;
    }

    public Forecastday_ withLow(Low low) {
        this.low = low;
        return this;
    }

    /**
     * 
     * @return
     *     The conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Forecastday_ withConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Forecastday_ withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The icon_url
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Forecastday_ withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The skyicon
     */
    public String getSkyicon() {
        return skyicon;
    }

    /**
     * 
     * @param skyicon
     *     The skyicon
     */
    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    public Forecastday_ withSkyicon(String skyicon) {
        this.skyicon = skyicon;
        return this;
    }

    /**
     * 
     * @return
     *     The pop
     */
    public Integer getPop() {
        return pop;
    }

    /**
     * 
     * @param pop
     *     The pop
     */
    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Forecastday_ withPop(Integer pop) {
        this.pop = pop;
        return this;
    }

    /**
     * 
     * @return
     *     The qpfAllday
     */
    public QpfAllday getQpfAllday() {
        return qpfAllday;
    }

    /**
     * 
     * @param qpfAllday
     *     The qpf_allday
     */
    public void setQpfAllday(QpfAllday qpfAllday) {
        this.qpfAllday = qpfAllday;
    }

    public Forecastday_ withQpfAllday(QpfAllday qpfAllday) {
        this.qpfAllday = qpfAllday;
        return this;
    }

    /**
     * 
     * @return
     *     The qpfDay
     */
    public QpfDay getQpfDay() {
        return qpfDay;
    }

    /**
     * 
     * @param qpfDay
     *     The qpf_day
     */
    public void setQpfDay(QpfDay qpfDay) {
        this.qpfDay = qpfDay;
    }

    public Forecastday_ withQpfDay(QpfDay qpfDay) {
        this.qpfDay = qpfDay;
        return this;
    }

    /**
     * 
     * @return
     *     The qpfNight
     */
    public QpfNight getQpfNight() {
        return qpfNight;
    }

    /**
     * 
     * @param qpfNight
     *     The qpf_night
     */
    public void setQpfNight(QpfNight qpfNight) {
        this.qpfNight = qpfNight;
    }

    public Forecastday_ withQpfNight(QpfNight qpfNight) {
        this.qpfNight = qpfNight;
        return this;
    }

    /**
     * 
     * @return
     *     The snowAllday
     */
    public SnowAllday getSnowAllday() {
        return snowAllday;
    }

    /**
     * 
     * @param snowAllday
     *     The snow_allday
     */
    public void setSnowAllday(SnowAllday snowAllday) {
        this.snowAllday = snowAllday;
    }

    public Forecastday_ withSnowAllday(SnowAllday snowAllday) {
        this.snowAllday = snowAllday;
        return this;
    }

    /**
     * 
     * @return
     *     The snowDay
     */
    public SnowDay getSnowDay() {
        return snowDay;
    }

    /**
     * 
     * @param snowDay
     *     The snow_day
     */
    public void setSnowDay(SnowDay snowDay) {
        this.snowDay = snowDay;
    }

    public Forecastday_ withSnowDay(SnowDay snowDay) {
        this.snowDay = snowDay;
        return this;
    }

    /**
     * 
     * @return
     *     The snowNight
     */
    public SnowNight getSnowNight() {
        return snowNight;
    }

    /**
     * 
     * @param snowNight
     *     The snow_night
     */
    public void setSnowNight(SnowNight snowNight) {
        this.snowNight = snowNight;
    }

    public Forecastday_ withSnowNight(SnowNight snowNight) {
        this.snowNight = snowNight;
        return this;
    }

    /**
     * 
     * @return
     *     The maxwind
     */
    public Maxwind getMaxwind() {
        return maxwind;
    }

    /**
     * 
     * @param maxwind
     *     The maxwind
     */
    public void setMaxwind(Maxwind maxwind) {
        this.maxwind = maxwind;
    }

    public Forecastday_ withMaxwind(Maxwind maxwind) {
        this.maxwind = maxwind;
        return this;
    }

    /**
     * 
     * @return
     *     The avewind
     */
    public Avewind getAvewind() {
        return avewind;
    }

    /**
     * 
     * @param avewind
     *     The avewind
     */
    public void setAvewind(Avewind avewind) {
        this.avewind = avewind;
    }

    public Forecastday_ withAvewind(Avewind avewind) {
        this.avewind = avewind;
        return this;
    }

    /**
     * 
     * @return
     *     The avehumidity
     */
    public Integer getAvehumidity() {
        return avehumidity;
    }

    /**
     * 
     * @param avehumidity
     *     The avehumidity
     */
    public void setAvehumidity(Integer avehumidity) {
        this.avehumidity = avehumidity;
    }

    public Forecastday_ withAvehumidity(Integer avehumidity) {
        this.avehumidity = avehumidity;
        return this;
    }

    /**
     * 
     * @return
     *     The maxhumidity
     */
    public Integer getMaxhumidity() {
        return maxhumidity;
    }

    /**
     * 
     * @param maxhumidity
     *     The maxhumidity
     */
    public void setMaxhumidity(Integer maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    public Forecastday_ withMaxhumidity(Integer maxhumidity) {
        this.maxhumidity = maxhumidity;
        return this;
    }

    /**
     * 
     * @return
     *     The minhumidity
     */
    public Integer getMinhumidity() {
        return minhumidity;
    }

    /**
     * 
     * @param minhumidity
     *     The minhumidity
     */
    public void setMinhumidity(Integer minhumidity) {
        this.minhumidity = minhumidity;
    }

    public Forecastday_ withMinhumidity(Integer minhumidity) {
        this.minhumidity = minhumidity;
        return this;
    }

}
