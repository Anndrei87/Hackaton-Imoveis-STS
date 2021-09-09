package com.darahimoveis.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.darahimoveis.application.dto.FotoDTO;
import com.darahimoveis.application.model.Foto;
import com.darahimoveis.application.service.FotoService;

@RestController
@RequestMapping("/foto")
@CrossOrigin
public class FotoController {
	@Autowired
	FotoService fotoService;
	
	// criar o get do findAllbyId
	
	@PostMapping
	public ResponseEntity<String> salvar(@RequestBody FotoDTO fotoDTO, @RequestBody MultipartFile file){
		fotoService.save(fotoDTO, file);
		return new ResponseEntity<String>("Foto enviada",HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public List<Foto> findAll() {
		List<Foto> imovel = fotoService.findAll();
		return imovel;
	}
}
