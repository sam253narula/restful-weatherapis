package com.sensefinity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sensefinity.client.WeatherClient;
import com.sensefinity.model.Response;
import com.sensefinity.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	WeatherClient client;

	@Override
	public Response getWeather(int cityId) {
		return client.getWeather(cityId);
	}

}
