package com.darahimoveis.controller;

import com.darahimoveis.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/imovel")
public class ImovelController {

    @Autowired
	ImovelService imovelService;
    
}
