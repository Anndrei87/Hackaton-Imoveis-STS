package com.darahimoveis.application.dto;

import com.darahimoveis.application.model.Contas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContasDTO {

	private Integer id_contas;
	private ImovelDTO imovelDTO;
	private Double aluguel;
	private Double iptu;
	private Double condominio;
	private Double internet;
	private Double tv_cabo;
	private Double agua;
	private Double energia;
	private Double gas;
	
public ContasDTO createContasDto(Contas contas) {
		
	ContasDTO contasDTO = new ContasDTO();
		
	contasDTO.setId_contas(contas.getId_contas());
	contasDTO.setImovelDTO(new ImovelDTO().createImovelDto(contas.getImovel()));
	contasDTO.setAluguel(contas.getAluguel());
	contasDTO.setIptu(contas.getIptu());
	contasDTO.setCondominio(contas.getCondominio());
	contasDTO.setInternet(contas.getInternet());
	contasDTO.setTv_cabo(contas.getTv_cabo());
	contasDTO.setAgua(contas.getAgua());
	contasDTO.setEnergia(contas.getEnergia());
	contasDTO.setGas(contas.getGas());
		
	return contasDTO;
	}
}
