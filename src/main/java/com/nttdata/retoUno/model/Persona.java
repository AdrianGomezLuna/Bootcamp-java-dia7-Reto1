package com.nttdata.retoUno.model;

import com.nttdata.retoUno.build.Builder;
import com.nttdata.retoUno.prototype.Clonar;

public class Persona extends Clonar implements Builder{
	
	private static Persona persona;
	
	private String name;

	public Persona() {	}
	
	public Persona(String name) {
		this.name = name;
	}
	
	public Persona(Persona persona) {
		super();
		this.equals(persona);
	}
	
	public static Persona getInstance(String name) {
		
		if(persona == null) {
			persona = new Persona();
			persona.setName(name);
		} else {
			System.err.println("No se ha podido crear nueva Persona");
		}
		
		return persona;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Prototype
	
	@Override
	public Persona clone(String name) {
		return new Persona(name);
	}

	//Builder
	
	@Override
	public Persona build(String name) {		
		return new Persona(name);
	}
	
	
	
	
	
	
	
	

}
