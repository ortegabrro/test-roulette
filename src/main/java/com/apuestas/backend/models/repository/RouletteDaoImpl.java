package com.apuestas.backend.models.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import com.apuestas.backend.models.Roulette;

@Repository
public class RouletteDaoImpl implements RouletteDao {

	public static final String KEY = "ROULETTE";
	
	@Autowired
	private RedisTemplate redisTemplate;


	@Override
	public int create() {
		Roulette roulette = new Roulette();
		try {
			redisTemplate.opsForHash().put(KEY, Integer.toString(roulette.getId()), roulette);
			return roulette.getId();
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	
	@Override
	public List<Roulette> findAll(){
        return null;
    }
}