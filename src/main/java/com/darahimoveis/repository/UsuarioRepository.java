package com.darahimoveis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darahimoveis.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
