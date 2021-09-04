	package com.darahimoveis.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; // Import the DateTimeFormatter class

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "imovel")
public class Imovel {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
	private Integer id_imovel;
	@Column
	private Integer cep;
	@Column
	private String logradouro;
	@Column
	private String numero;
	@Column
	private String complemento;
    @Column
	private String bairro;
	@Column
	private String cidade;
	@Column
	private String estado;
	@Column
	private String tipo_imovel;
	@Column
	private Integer qtd_banheiro;
	@Column
	private Double metragem_imovel;
    
}
