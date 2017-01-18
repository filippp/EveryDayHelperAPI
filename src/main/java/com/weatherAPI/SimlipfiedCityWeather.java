package com.weatherAPI;

/**
 * Created by filip.kozak on 07.12.2016.
 */
public class SimlipfiedCityWeather {
    private String conditions;
    //probability of precipitation
    private int pop;
    private String temperature;
    private String dateAndDay;
    private int avewind;

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDateAndDay() {
        return dateAndDay;
    }

    public void setDateAndDay(String dateAndDay) {
        this.dateAndDay = dateAndDay;
    }

    public int getAvewind() {
        return avewind;
    }

    public void setAvewind(int avewind) {
        this.avewind = avewind;
    }

    public SimlipfiedCityWeather(String conditions, int pop, String temperature, String dateAndDay, int avewind) {
        this.conditions = conditions;
        this.pop = pop;
        this.temperature = temperature;
        this.dateAndDay = dateAndDay;
        this.avewind = avewind;
    }
}
