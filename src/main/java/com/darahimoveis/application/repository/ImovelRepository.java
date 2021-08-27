package com.darahimoveis.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darahimoveis.application.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Integer> {
    
}
