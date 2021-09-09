	package com.darahimoveis.application.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
    
    @ManyToMany
    @JoinTable(name="contas_imovel", joinColumns=@JoinColumn(name = "id_imovel"),inverseJoinColumns = @JoinColumn(name = "id_contas"))
    private List<Contas> contas;
    
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
	private Integer qtd_num_pessoas;
	
	@Column
	private Double metragem_imovel;
    
}
