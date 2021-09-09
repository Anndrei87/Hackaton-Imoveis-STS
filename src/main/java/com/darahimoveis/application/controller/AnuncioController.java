package com.darahimoveis.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.application.dto.AnuncioDTO;
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
	
	@GetMapping
	public Page<Anuncio> pesquisarTodos(
		@RequestParam(required = false, defaultValue = "0") Integer pagina, 
		@RequestParam(required = false , defaultValue = "10") Integer linhas, 
	    @RequestParam(required = false, defaultValue = "cpf") String ordenandoPor, 
		@RequestParam(required = false, defaultValue = "ASC") String direcaoOrderBy
		){
		return anuncioService.findAll(pagina, linhas, ordenandoPor, direcaoOrderBy);
	}
	
	@PostMapping
	public ResponseEntity<String> salvarAnuncio(@RequestBody AnuncioDTO anuncioDTO){
		anuncioService.save(anuncioDTO);
		return new ResponseEntity<String>("Anúncio Cadastrado!",HttpStatus.CREATED);
	}
}
