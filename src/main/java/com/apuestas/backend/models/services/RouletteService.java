package com.apuestas.backend.models.services;

import java.util.List;

import com.apuestas.backend.models.Roulette;

public interface RouletteService {
	public int create();
	public int spin();
	public List<Roulette> findAll();
}
