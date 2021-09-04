package com.darahimoveis.application.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "anuncio")
public class Anuncio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_anuncio")
    private Integer id_anuncio;
	
	@OneToOne
	private Imovel imovel;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "foto")
	private List<Foto> fotos;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Mapa mapa;
	
	@Column
	@DateTimeFormat
	private LocalDateTime data_publicacao;
	
	
	/*Testando a formatação da Data e Hora*/
	public void mostraDataHora() {
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}
}