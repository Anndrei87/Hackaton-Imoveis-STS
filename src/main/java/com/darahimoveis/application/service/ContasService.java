package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darahimoveis.application.model.Contas;

@Service
public class ContasService {
	
	@Autowired
	ContasService contasService;
    
    @GetMapping("/findAll")
	public Optional<Contas> findAll() {
		Optional<Contas> contas = contasService.findAll();
		return contas;
	}	
    
    @GetMapping("/findById")
	public Optional<Contas> findByID(@RequestParam Integer id) {
		Optional<Contas> contas = contasService.findByID(id);
		return contas;
	}
}
