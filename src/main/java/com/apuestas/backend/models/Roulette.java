package com.apuestas.backend.models;

import com.apuestas.backend.models.enums.TypeState;

public class Roulette {
	
	
	private String id;
	private TypeState typeState;
	
	
	public Roulette(String id, TypeState typeState) {
		super();
		this.id = id;
		this.typeState = typeState;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TypeState getTypeState() {
		return typeState;
	}
	public void setTypeState(TypeState typeState) {
		this.typeState = typeState;
	}
	
}
