package com.apuestas.backend.models.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apuestas.backend.models.Roulette;
import com.apuestas.backend.models.repository.RouletteDao;


@Service
public class RouletteServiceImpl implements RouletteService{
	
	@Autowired
	private RouletteDao rouletteDao;
	
	@Override
	public int create() {
		// TODO Auto-generated method stub
		return rouletteDao.create();
	}

	@Override
	public int spin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Roulette> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
