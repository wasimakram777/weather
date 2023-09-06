package com.weatherapp.controller;

import com.weatherapp.model.WeatherVO;
import com.weatherapp.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/getCurrentWeather")
    public ResponseEntity<WeatherVO> getWeather() {
        try {
            WeatherVO weatherData = weatherService.getWeather();
            return ResponseEntity.ok(weatherData);
        } catch (Exception e){
            throw new RuntimeException("Cannot get Weather Info currently, please try later");
        }
    }
}
