package com.darahimoveis.application.dto;

import com.darahimoveis.application.model.Imovel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImovelDTO {
    
	private Integer cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String tipo_imovel;
	private Integer qtd_banheiro;
	private Double metragem_imovel;
	
public ImovelDTO createImovelDto(Imovel imovel) {
		
	ImovelDTO imovelDTO = new ImovelDTO();
		
	imovelDTO.setCep(imovel.getCep());
	imovelDTO.setLogradouro(imovel.getLogradouro());
	imovelDTO.setNumero(imovel.getNumero());
	imovelDTO.setComplemento(imovel.getComplemento());
	imovelDTO.setBairro(imovel.getBairro());
	imovelDTO.setCidade(imovel.getCidade());
	imovelDTO.setEstado(imovel.getEstado());
	imovelDTO.setTipo_imovel(imovel.getTipo_imovel());
	imovelDTO.setQtd_banheiro(imovel.getQtd_banheiro());
	imovelDTO.setMetragem_imovel(imovel.getMetragem_imovel());
	
	return imovelDTO;
	}
	
}
