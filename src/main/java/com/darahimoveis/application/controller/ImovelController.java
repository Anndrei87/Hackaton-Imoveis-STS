package com.darahimoveis.application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.application.model.Imovel;
import com.darahimoveis.application.service.ImovelService;

@RestController
@RequestMapping("/imovel")
@CrossOrigin
public class ImovelController {

    @Autowired
	ImovelService imovelService;
    
    @GetMapping("/findAll")
	public Optional<Imovel> findByID() {
		Optional<Imovel> imovel = Optional.of(new Imovel());
		return imovel;
	}
    
}
