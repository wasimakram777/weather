package com.weatherapp.services;

import com.weatherapp.model.WeatherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WeatherServiceImpl implements WeatherService{

    private String openWeatherApiKey="944fbae628676c84e4465623f0042a2e";

    private String openWeatherApiUrl="https://api.openweathermap.org/data/2.5/weather?";

    @Override
    public WeatherVO getWeather() {

        String openWeatherAppUrl = openWeatherApiUrl + "lat=52.5200&lon=13.4050&exclude=hourly,daily,alerts&appid=" + openWeatherApiKey;
        RestTemplate restTemplate=new RestTemplate();
        Map weatherVO = restTemplate.getForObject(openWeatherAppUrl, Map.class);
        Map weatherMainData=(Map)weatherVO.get("main");
        WeatherVO weatherVO1=new WeatherVO();
        weatherVO1.setCity("Berlin");
        weatherVO1.setLatitude(52.5200);
        weatherVO1.setLongitude(13.4050);
        weatherVO1.setHumidity(Float.parseFloat(weatherMainData.get("humidity").toString()));
        weatherVO1.setPressure(Float.parseFloat(weatherMainData.get("pressure").toString()));
        weatherVO1.setTemperature(Double.parseDouble(weatherMainData.get("temp").toString()));
        return weatherVO1;
    }
}
