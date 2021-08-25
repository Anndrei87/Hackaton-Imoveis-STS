package com.darahimoveis.repository;

import java.util.Optional;
import com.darahimoveis.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    public Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
