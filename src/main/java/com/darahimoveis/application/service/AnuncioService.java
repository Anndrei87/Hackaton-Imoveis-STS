package com.darahimoveis.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Anuncio;
import com.darahimoveis.application.repository.AnuncioRepository;

@Service
public class AnuncioService {
	
	@Autowired
	AnuncioRepository anuncioRepository;
	
	public List<Anuncio> findAll(){
		List<Anuncio> anuncios = anuncioRepository.findAll();
		return anuncios;
	}
    
}
