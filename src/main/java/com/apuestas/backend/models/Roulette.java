package com.apuestas.backend.models;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import com.apuestas.backend.models.enums.TypeState;

public class Roulette implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private TypeState typeState;
	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public Roulette() {
		super();
		this.id= atomicInteger.incrementAndGet();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeState getTypeState() {
		return typeState;
	}
	public void setTypeState(TypeState typeState) {
		this.typeState = typeState;
	}
	
}
