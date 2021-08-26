package com.darahimoveis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darahimoveis.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	@Override
	default <S extends Usuario> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
