package com.darahimoveis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDTO {
    
	private Integer id;
	private String nome;
	private String sobrenome;
	private Integer whatsapp;
	private String email;
	private String senha;

}
