package com.darahimoveis.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Usuario;
import com.darahimoveis.application.repository.UsuarioRepository;

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
