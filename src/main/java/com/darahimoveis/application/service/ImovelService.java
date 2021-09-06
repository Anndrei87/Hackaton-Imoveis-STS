package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Imovel;
import com.darahimoveis.application.repository.ImovelRepository;

@Service
public class ImovelService {
    
    @Autowired
	ImovelRepository imovelRepository;
    
    public Optional<Imovel> findById(Integer id) {
		Optional<Imovel> imovel = imovelRepository.findById(id);
		return imovel;
	}
    
    public void save(Integer cep, String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
    				 String tipo_imovel, Integer qtd_banheiro, Double metragem_imovel){
		
    	Imovel imovel = new Imovel();

		if(cep != null){	
			imovel.setCep(cep);
			imovel.setLogradouro(logradouro);
			imovel.setNumero(numero);
			imovel.setComplemento(complemento);
			imovel.setBairro(bairro);
			imovel.setCidade(cidade);
			imovel.setEstado(estado);
			imovel.setTipo_imovel(tipo_imovel);
			imovel.setQtd_banheiro(qtd_banheiro);
			imovel.setMetragem_imovel(metragem_imovel);
			
			imovelRepository.save(imovel);
		}
	}
}
