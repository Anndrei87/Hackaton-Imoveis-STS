package com.darahimoveis.application.dto;

import com.darahimoveis.application.model.Quarto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuartoDTO {
	
	private Integer id_quarto;
	private Integer id_imovel;
	private String tipo_quarto;
	private Double metragem_quarto;
	
	public QuartoDTO createQuartoDto(Quarto quarto) {
			
			QuartoDTO quartoDTO = new QuartoDTO();
			
			quartoDTO.setId_quarto(quarto.getId_quarto());
			quartoDTO.setId_imovel(quarto.getId_imovel());
			quartoDTO.setTipo_quarto(quarto.getTipo_quarto());
			quartoDTO.setMetragem_quarto(quarto.getMetragem_quarto());
			
			return quartoDTO;
		}
}
