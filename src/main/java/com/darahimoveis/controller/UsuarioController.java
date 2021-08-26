package com.darahimoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.service.UsuarioService;

@RestController
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	
	
	@GetMapping
	public String oi() {
		return "OI";
	}
	
//	@PostMapping
//	public ResponseEntity<String> salvar(
//		@RequestBody(required = true) 	String nome, 
//		@RequestBody(required = true) 	String sobrenome,
//		@RequestBody(required = false) 	String whatsapp,
//		@RequestBody(required = true) 	String email,
//		@RequestBody(required = true) 	String senha)
//	{
//		usuarioService.save(nome, sobrenome, whatsapp, email, senha);
//		return new ResponseEntity<String>("ok",HttpStatus.OK);
//	}
}
