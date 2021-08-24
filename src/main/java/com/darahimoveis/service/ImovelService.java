package com.darahimoveis.service;

import com.darahimoveis.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {
    
    @Autowired
	ImovelRepository imovelRepository;
}
