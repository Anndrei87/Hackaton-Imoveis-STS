package com.darahimoveis.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.dto.UsuarioDTO;
import com.darahimoveis.model.Usuario;
import com.darahimoveis.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void save(String nome, String sobrenome, String whatsapp, String email, String senha){
		Usuario usuario = new Usuario();

		if(!nome.isEmpty() && !sobrenome.isEmpty() && !email.isEmpty() && !senha.isEmpty()){	
			usuario.setNome(nome);
			usuario.setSobrenome(sobrenome);
			usuario.setWhatsapp(whatsapp);
			usuario.setEmail(email);
			usuario.setSenha(senha);
			usuarioRepository.save(usuario);
		}
	}
}
