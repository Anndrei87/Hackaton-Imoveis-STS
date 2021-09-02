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
	
	
	private Integer id_imovel;
	private String tipo_quarto;
	private Double metragem_quarto;
	private Integer qtd_cama;
	private String descricao_quarto;
	
	
	public QuartoDTO createQuartoDto(Quarto quarto) {
			
			QuartoDTO quartoDTO = new QuartoDTO();
			
			
			quartoDTO.setTipo_quarto(tipo_quarto);
			quartoDTO.setQtd_cama(qtd_cama);
			quartoDTO.setDescricao_quarto(descricao_quarto);
			quartoDTO.setMetragem_quarto(metragem_quarto);
			
			return quartoDTO;
		}
}
