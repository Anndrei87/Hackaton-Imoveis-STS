package com.darahimoveis.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImovelDTO {
    
    private Integer id;
    private Integer id_usuario;
	private String tituloImovel;
	private Integer cep;
	private String logradouro;
	private String numeor;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
}
