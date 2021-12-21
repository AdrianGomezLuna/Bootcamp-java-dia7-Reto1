package com.nttdata.retoUno;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.retoUno.model.Persona;

@SpringBootApplication
public class RetoUnoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RetoUnoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Singleton
		System.out.println("---Singleton---");
		Persona persona = Persona.getInstance("Adrian");
		System.out.println("Persona --> " + persona.getName());
		Persona persona2 = Persona.getInstance("Ana");
		System.out.println("Persona --> " + persona2.getName());
		
		//Prototype
		System.out.println("---Prototype---");
		Persona personaPrototype = persona.clone("Ana");
		System.out.println("Persona Prototype --> " + personaPrototype.getName());
		
		//Builder
		System.out.println("---Builder---");
		Persona personaBuilder = persona.build("Juan");
		System.out.println("Persona Builder --> " + personaBuilder.getName());
	}

}
