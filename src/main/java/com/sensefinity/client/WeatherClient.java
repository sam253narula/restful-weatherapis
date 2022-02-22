package com.sensefinity.client;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sensefinity.model.Response;


@FeignClient(url = "http://api.openweathermap.org/data/2.5", name = "WEATHER-CLIENT")
public interface WeatherClient {

	// http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=1c158d4e67d9462a7b8d80e786d890cf
	@GetMapping("/forecast?id={id}&appid=1c158d4e67d9462a7b8d80e786d890cf")
	Response getWeather(@PathVariable(value="id") int id );
	
}
