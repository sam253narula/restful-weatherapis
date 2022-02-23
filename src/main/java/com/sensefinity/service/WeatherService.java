package com.sensefinity.service;

import org.springframework.stereotype.Component;

import com.sensefinity.model.Response;

@Component
public interface WeatherService {

	Object getWeather(int cityId);

}