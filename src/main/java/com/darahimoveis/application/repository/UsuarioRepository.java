package com.darahimoveis.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darahimoveis.application.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
//	Optional<Usuario> findByLoginAndSenha(String email, String senha);

	public Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
