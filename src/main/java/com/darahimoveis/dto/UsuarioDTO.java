package com.darahimoveis.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    
	private Integer id;
	private String nome;
	private String sobrenome;
	private Integer whatsapp;
	private String email;
	private String senha;
}
