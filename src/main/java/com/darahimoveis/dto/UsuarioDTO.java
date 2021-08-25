package com.darahimoveis.dto;

import com.darahimoveis.model.Usuario;

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
	private String whatsapp;
	private String email;
	private String senha;

	public UsuarioDTO createUsuarioDto(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		
		usuarioDTO.setNome(usuario.getNome());
		usuarioDTO.setSobrenome(usuario.getSobrenome());
		usuarioDTO.setWhatsapp(usuario.getWhatsapp());
		usuarioDTO.setEmail(usuario.getEmail());
		usuarioDTO.setSenha(usuario.getSenha());
		
		return usuarioDTO;
	}
}
