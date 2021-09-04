package com.darahimoveis.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Contas;
import com.darahimoveis.application.repository.ContasRepository;

@Service
public class ContasService {
	
	@Autowired
	ContasRepository contasRepository;

	public Optional<Contas> findById(Integer id) {
		Optional<Contas> contas = contasRepository.findById(id);
		return contas;
	}
	
	public List<Contas> findAll() {
		List<Contas> contas = contasRepository.findAll();
		return contas;
	}
    
}
