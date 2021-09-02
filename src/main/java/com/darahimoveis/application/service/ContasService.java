package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Contas;

@Service
public class ContasService {
	
	@Autowired
	ContasService contasService;
    
	
	public Optional<Contas> findAll() {
		Optional<Contas> contas = contasService.findAll();
		return contas;
	}	
    
    public Optional<Contas> findById(Integer id) {
		Optional<Contas> contas = contasService.findById(id);
		return contas;
	}
}
