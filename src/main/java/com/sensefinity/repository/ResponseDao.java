package com.sensefinity.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDao {

	public static final String HASH_KEY = "Response";

	@Autowired
	private RedisTemplate template;

	public Object save(Object response, int cityId) {
		template.opsForHash().put(HASH_KEY, cityId, response);
		return response;
	}

	public List<Object> findAll() {
		return template.opsForHash().values(HASH_KEY);
	}

	public Object findResponseById(int id) {
		 Object object  = template.opsForHash().get(HASH_KEY, new Integer(id));
		 return object;
	}

	public String deleteResponse(int id) {
		template.opsForHash().delete(HASH_KEY, id);
		return "Response removed !!";
	}
}