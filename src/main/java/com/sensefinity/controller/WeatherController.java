package com.sensefinity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sensefinity.model.Response;
import com.sensefinity.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService weatherService;

	@GetMapping("/weather/city/{cityId}")
	public Response getWeather(@PathVariable int cityId) {
		return weatherService.getWeather(cityId);
	}
}
