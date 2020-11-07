package com.apuestas.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apuestas.backend.models.Roulette;
import com.apuestas.backend.models.services.RouletteService;

@RestController
public class RouletteController {

	@Autowired
	private RouletteService rouletteService;

	@GetMapping("/roulette")
	public ResponseEntity<String> create() {
		int res = rouletteService.create();
		if (res != 0) {
			return ResponseEntity.ok("Id Roulette: " + res);
		} else {
			return ResponseEntity.badRequest().body("Error create Roulette");
		}
	}

	@GetMapping("/list")
	public ResponseEntity<List<Roulette>> listRoulettes() {
		List<Roulette> roulletes = rouletteService.findAll();
		return ResponseEntity.ok(roulletes);
	}

}