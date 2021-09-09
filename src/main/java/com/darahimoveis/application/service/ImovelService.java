package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.dto.ImovelDTO;
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
    
    public Integer save(ImovelDTO imovelDTO){
		
    	Imovel imovel = new Imovel();
    	Imovel imovelRetorno = new Imovel();

		if(imovelDTO.getCep() != null){	
			imovel.setCep(imovelDTO.getCep());
			imovel.setLogradouro(imovelDTO.getLogradouro());
			imovel.setNumero(imovelDTO.getNumero());
			imovel.setComplemento(imovelDTO.getComplemento());
			imovel.setBairro(imovelDTO.getBairro());
			imovel.setCidade(imovelDTO.getCidade());
			imovel.setEstado(imovelDTO.getEstado());
			imovel.setTipo_imovel(imovelDTO.getTipo_imovel());
			imovel.setQtd_banheiro(imovelDTO.getQtd_banheiro());
			imovel.setMetragem_imovel(imovelDTO.getMetragem_imovel());
			imovel.setQtd_num_pessoas(imovelDTO.getQtd_num_pessoas());
			imovelRetorno = imovelRepository.save(imovel);
		}
		
		
		return imovelRetorno.getId_imovel();
	}
}
