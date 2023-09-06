package com.weatherapp.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeatherVO implements Serializable {

        private static final long serialVersionUID = 1L;

        private String city;
        private Double longitude;
        private Double latitude;
        private Float pressure;
        private Float humidity;
        private Double temperature;
}
