package com.darahimoveis.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darahimoveis.application.model.Quarto;
import com.darahimoveis.application.repository.QuartoRepository;

@Service
public class QuartoService {
	@Autowired
	QuartoRepository quartoRepository;
	
	public void save(String descricao_quarto, String tipo_quarto, Integer qtd_cama, Double metragem_quarto){
		Quarto quarto = new Quarto();

		if(descricao_quarto != null && tipo_quarto != null && qtd_cama != null && metragem_quarto != null){	
			quarto.setDescricao_quarto(descricao_quarto);;
			quarto.setTipo_quarto(tipo_quarto);
			quarto.setQtd_cama(qtd_cama);;
			quarto.setMetragem_quarto(metragem_quarto);;
			quartoRepository.save(quarto);
		}
	}
	
	
	public Optional<Quarto> findById(Integer id_quarto) {
		Optional<Quarto> quarto = quartoRepository.findById(id_quarto);
		return quarto;
	}
}
