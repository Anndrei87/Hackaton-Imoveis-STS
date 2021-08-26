package com.darahimoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.service.UsuarioService;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping
	public ResponseEntity<String> salvar(
		@RequestParam(required = true, defaultValue = "Duan") String nome, 
		@RequestParam(required = true, defaultValue = "Camargo") String sobrenome,
		@RequestParam(required = true, defaultValue = "+5571991801813") String whatsapp,
		@RequestParam(required = true, defaultValue = "duan1505@gmail.com") String email,
		@RequestParam(required = true, defaultValue = "123") String senha)
	{
		usuarioService.save(nome, sobrenome, whatsapp, email, senha);
		return new ResponseEntity<String>("ok",HttpStatus.OK);
	}
}
