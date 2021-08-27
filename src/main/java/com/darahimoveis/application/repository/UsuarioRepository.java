package com.darahimoveis.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darahimoveis.application.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
