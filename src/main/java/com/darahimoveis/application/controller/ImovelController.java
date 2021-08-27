package com.darahimoveis.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darahimoveis.application.service.ImovelService;

@RestController
@RequestMapping("v1/imovel")
public class ImovelController {

    @Autowired
	ImovelService imovelService;
    
}
