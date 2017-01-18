package com.weatherAPI;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by filip.kozak on 07.12.2016.
 */
@RestController
public class CityWeather {
    WeatherUtil wUtil = new WeatherUtil();

    @RequestMapping("/Warszawa")
    public @ResponseBody
    ArrayList<SimlipfiedCityWeather> warsaw(){
        return wUtil.getCityForecast("Warsaw");
    }

    @RequestMapping("/Krakow")
    public @ResponseBody
    ArrayList<SimlipfiedCityWeather> cracow(){
        return wUtil.getCityForecast("Krakow");
    }

    //TODO MORE CITIES or find a better solution for example some queries?

}
