package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.dto.ContasDTO;
import com.darahimoveis.application.model.Contas;
import com.darahimoveis.application.model.Imovel;
import com.darahimoveis.application.repository.ContasRepository;

@Service
public class ContasService {
	
	@Autowired
	ContasRepository contasRepository;

	public Optional<Contas> findById(Integer id) {
		Optional<Contas> contas = contasRepository.findById(id);
		return contas;
	}
	
	public void save(ContasDTO contasDTO){
		Contas contas = new Contas();
		
		if(contasDTO.getAluguel() != null){	
			Imovel imovel = new Imovel();
			
			imovel.setId_imovel(contasDTO.getImovelDTO().getId_imovel());
			contas.setAluguel(contasDTO.getAluguel());
			contas.setIptu(contasDTO. getIptu());
			contas.setCondominio(contasDTO.getCondominio());
			contas.setInternet(contasDTO.getInternet());
			contas.setTv_cabo(contasDTO.getTv_cabo());
			contas.setAgua(contasDTO.getAgua());
			contas.setEnergia(contasDTO.getEnergia());
			contas.setGas(contasDTO.getGas());
			contasRepository.save(contas);
		}else {
			System.out.println("Deu Algum erro no service");
		}
	}
    
}
