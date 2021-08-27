package com.darahimoveis.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.repository.ImovelRepository;

@Service
public class ImovelService {
    
    @Autowired
	ImovelRepository imovelRepository;
}
