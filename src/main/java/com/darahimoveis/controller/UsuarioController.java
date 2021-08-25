package com.darahimoveis.controller;

import com.darahimoveis.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	// private Integer id;
	// private String nome;
	// private String sobrenome;
	// private Integer whatsapp;
	// private String email;
	// private String senha;

	@PostMapping
	public ResponseEntity<String> salvar(
		@RequestParam String nome, 
		@RequestParam String sobrenome,
		@RequestParam Integer whatsapp,
		@RequestParam String email,
		@RequestParam String senha)
		{

		usuarioService.save(nome, sobrenome, whatsapp, email, senha);
		return new ResponseEntity<String>("ok",HttpStatus.OK);
	}
}
