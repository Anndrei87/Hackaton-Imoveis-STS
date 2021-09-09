package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.dto.QuartoDTO;
import com.darahimoveis.application.model.Quarto;
import com.darahimoveis.application.repository.QuartoRepository;

@Service
public class QuartoService {
	@Autowired
	QuartoRepository quartoRepository;
	
	public void save(QuartoDTO quartoDTO){
		Quarto quarto = new Quarto();

		if(quartoDTO.getId_imovel() != null){	
			quarto.setTipo_quarto(quartoDTO.getTipo_quarto());
			quarto.setMetragem_quarto(quartoDTO. getMetragem_quarto());
			quarto.setId_imovel(quartoDTO.getId_imovel());
			quartoRepository.save(quarto);
		}else {
			System.out.println("Deu Algum erro no service");
		}
	}
	
	
	public Optional<Quarto> findById(Integer id_quarto) {
		Optional<Quarto> quarto = quartoRepository.findById(id_quarto);
		return quarto;
	}
}
