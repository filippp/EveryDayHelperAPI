
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Date {

    @SerializedName("epoch")
    @Expose
    private String epoch;
    @SerializedName("pretty")
    @Expose
    private String pretty;
    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("yday")
    @Expose
    private Integer yday;
    @SerializedName("hour")
    @Expose
    private Integer hour;
    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("sec")
    @Expose
    private Integer sec;
    @SerializedName("isdst")
    @Expose
    private String isdst;
    @SerializedName("monthname")
    @Expose
    private String monthname;
    @SerializedName("monthname_short")
    @Expose
    private String monthnameShort;
    @SerializedName("weekday_short")
    @Expose
    private String weekdayShort;
    @SerializedName("weekday")
    @Expose
    private String weekday;
    @SerializedName("ampm")
    @Expose
    private String ampm;
    @SerializedName("tz_short")
    @Expose
    private String tzShort;
    @SerializedName("tz_long")
    @Expose
    private String tzLong;

    /**
     * 
     * @return
     *     The epoch
     */
    public String getEpoch() {
        return epoch;
    }

    /**
     * 
     * @param epoch
     *     The epoch
     */
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public Date withEpoch(String epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * 
     * @return
     *     The pretty
     */
    public String getPretty() {
        return pretty;
    }

    /**
     * 
     * @param pretty
     *     The pretty
     */
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public Date withPretty(String pretty) {
        this.pretty = pretty;
        return this;
    }

    /**
     * 
     * @return
     *     The day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    public Date withDay(Integer day) {
        this.day = day;
        return this;
    }

    /**
     * 
     * @return
     *     The month
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    public Date withMonth(Integer month) {
        this.month = month;
        return this;
    }

    /**
     * 
     * @return
     *     The year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    public Date withYear(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * 
     * @return
     *     The yday
     */
    public Integer getYday() {
        return yday;
    }

    /**
     * 
     * @param yday
     *     The yday
     */
    public void setYday(Integer yday) {
        this.yday = yday;
    }

    public Date withYday(Integer yday) {
        this.yday = yday;
        return this;
    }

    /**
     * 
     * @return
     *     The hour
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * 
     * @param hour
     *     The hour
     */
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Date withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * 
     * @return
     *     The min
     */
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(String min) {
        this.min = min;
    }

    public Date withMin(String min) {
        this.min = min;
        return this;
    }

    /**
     * 
     * @return
     *     The sec
     */
    public Integer getSec() {
        return sec;
    }

    /**
     * 
     * @param sec
     *     The sec
     */
    public void setSec(Integer sec) {
        this.sec = sec;
    }

    public Date withSec(Integer sec) {
        this.sec = sec;
        return this;
    }

    /**
     * 
     * @return
     *     The isdst
     */
    public String getIsdst() {
        return isdst;
    }

    /**
     * 
     * @param isdst
     *     The isdst
     */
    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public Date withIsdst(String isdst) {
        this.isdst = isdst;
        return this;
    }

    /**
     * 
     * @return
     *     The monthname
     */
    public String getMonthname() {
        return monthname;
    }

    /**
     * 
     * @param monthname
     *     The monthname
     */
    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    public Date withMonthname(String monthname) {
        this.monthname = monthname;
        return this;
    }

    /**
     * 
     * @return
     *     The monthnameShort
     */
    public String getMonthnameShort() {
        return monthnameShort;
    }

    /**
     * 
     * @param monthnameShort
     *     The monthname_short
     */
    public void setMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
    }

    public Date withMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
        return this;
    }

    /**
     * 
     * @return
     *     The weekdayShort
     */
    public String getWeekdayShort() {
        return weekdayShort;
    }

    /**
     * 
     * @param weekdayShort
     *     The weekday_short
     */
    public void setWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
    }

    public Date withWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
        return this;
    }

    /**
     * 
     * @return
     *     The weekday
     */
    public String getWeekday() {
        return weekday;
    }

    /**
     * 
     * @param weekday
     *     The weekday
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public Date withWeekday(String weekday) {
        this.weekday = weekday;
        return this;
    }

    /**
     * 
     * @return
     *     The ampm
     */
    public String getAmpm() {
        return ampm;
    }

    /**
     * 
     * @param ampm
     *     The ampm
     */
    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public Date withAmpm(String ampm) {
        this.ampm = ampm;
        return this;
    }

    /**
     * 
     * @return
     *     The tzShort
     */
    public String getTzShort() {
        return tzShort;
    }

    /**
     * 
     * @param tzShort
     *     The tz_short
     */
    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    public Date withTzShort(String tzShort) {
        this.tzShort = tzShort;
        return this;
    }

    /**
     * 
     * @return
     *     The tzLong
     */
    public String getTzLong() {
        return tzLong;
    }

    /**
     * 
     * @param tzLong
     *     The tz_long
     */
    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
    }

    public Date withTzLong(String tzLong) {
        this.tzLong = tzLong;
        return this;
    }

}
