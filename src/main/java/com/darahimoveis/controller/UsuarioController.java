package com.darahimoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.service.UsuarioService;

@RestController
@RequestMapping("v1/agencias")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
}
