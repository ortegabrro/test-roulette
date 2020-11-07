package com.apuestas.backend.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.apuestas.backend.models.Roulette;

public interface RouletteDao {

	public int create();
	List<Roulette> findAll();
}
