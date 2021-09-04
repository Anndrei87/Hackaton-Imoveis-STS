package com.darahimoveis.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.application.model.Anuncio;
import com.darahimoveis.application.service.AnuncioService;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class AnuncioController {
	
	@Autowired
	AnuncioService anuncioService;
	
	@GetMapping("findAll")
	public List<Anuncio> findAll(){
		List<Anuncio> anuncios = anuncioService.findAll();
		return anuncios;
	}
}
