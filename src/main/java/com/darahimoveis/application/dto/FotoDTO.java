package com.darahimoveis.application.dto;

import com.darahimoveis.application.model.Foto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FotoDTO {

	
	private String descricao_foto;
	private Byte[] foto;
	
	
	public FotoDTO createFotoDto(Foto foto) {
		
		FotoDTO fotoDTO = new FotoDTO();
		
		fotoDTO.setDescricao_foto(descricao_foto);
		fotoDTO.setFoto(getFoto());
		
		return fotoDTO;
	}
}
