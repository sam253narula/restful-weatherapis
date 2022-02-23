package com.sensefinity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sensefinity.client.WeatherClient;
import com.sensefinity.model.Response;
import com.sensefinity.repository.ResponseDao;
import com.sensefinity.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	WeatherClient client;

	@Autowired
	ResponseDao responseDao;

	@Override
	public Object getWeather(int cityId) {
		// First check in redis cache if the record is already there, then fetch it and return it
		Object response = responseDao.findResponseById(cityId);
		if (response != null) {
			return response;
		}
		//Else get the weather fby using weather client and save it it redis and also return it
		else {
			Object weather = client.getWeather(cityId);
			responseDao.save(weather, cityId);
			return weather;
		}
	}

}
