package com.darahimoveis.repository;

import com.darahimoveis.model.Imovel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Integer> {
    
}
