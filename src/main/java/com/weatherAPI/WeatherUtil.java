package com.weatherAPI;

import java.util.ArrayList;

/**
 * Created by filip.kozak on 07.12.2016.
 */
public class WeatherUtil {

    //We are getting value from api we have consumed, and we return simplified json for the sake of our application
    //Thanks to that our app would be much lighter (1 fetching class instead of 20)
    public void getForecast(Example example, ArrayList<SimlipfiedCityWeather> forecastDaysList) {
        if (example.getForecast().getSimpleforecast().getForecastday() != null) {
            for (Forecastday_ forecastDay : example.getForecast().getSimpleforecast().getForecastday()) {
                SimlipfiedCityWeather oneDay = new SimlipfiedCityWeather(forecastDay.getConditions(), forecastDay.getPop(),
                        forecastDay.getHigh().getCelsius(), forecastDay.getDate().getWeekday(),
                        forecastDay.getAvewind().getKph());
                forecastDaysList.add(oneDay);
            }
        }
    }

    //
    public ArrayList<SimlipfiedCityWeather> getCityForecast(String city){
            Application app = new Application();
            Example weather = app.pareForecast(app.getApiKey(), city);
            ArrayList<SimlipfiedCityWeather> forecastJson = new ArrayList<>();
            getForecast(weather, forecastJson);
            return forecastJson;
    }
}
