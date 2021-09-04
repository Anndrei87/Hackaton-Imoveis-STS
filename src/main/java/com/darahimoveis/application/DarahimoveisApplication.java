package com.darahimoveis.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.darahimoveis.application.model.Anuncio;

@SpringBootApplication
public class DarahimoveisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarahimoveisApplication.class, args);
		
		Anuncio a = new Anuncio();
		a.mostraDataHora();
	}

}
