package com.weatherAPI;
/**
 * Created by filip.kozak on 06.12.2016.
 */


import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Application {

    //api key from WeatherUnderground
    private static final String apiKey = "20c8fc3ffdd6fe24";
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    //TODO Default Value should be entered by USER or by GPS location
    //Right now default is Warsaw


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public Example pareForecast(String apiKey, String city){
        RestTemplate restTemplate = new RestTemplate();
        Example forecast = restTemplate.getForObject("http://api.wunderground.com/api/"+apiKey+ "/forecast/q/PL/"+city+".json", Example.class);
        return forecast;
    }

    public static String getApiKey() {
        return apiKey;
    }


}
