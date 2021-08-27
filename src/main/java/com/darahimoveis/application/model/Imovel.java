package com.darahimoveis.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "imovel")
public class Imovel {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column
    private Integer id_usuario;
	@Column
	private String tituloImovel;
	@Column
	private Integer cep;
	@Column
	private String logradouro;
	@Column
	private String numeor;
	@Column
	private String complemento;
    @Column
	private String bairro;
	@Column
	private String cidade;
	@Column
	private String estado;
    
}
