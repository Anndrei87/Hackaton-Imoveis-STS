package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Imovel;
import com.darahimoveis.application.repository.ImovelRepository;

@Service
public class ImovelService {
    
    @Autowired
	ImovelRepository imovelRepository;
    
    public Optional<Imovel> findById(Integer id) {
		Optional<Imovel> imovel = imovelRepository.findById(id);
		return imovel;
	}
}
