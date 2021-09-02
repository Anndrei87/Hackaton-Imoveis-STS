package com.darahimoveis.application.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;
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
    @Column(name = "id_imovel")
	private Integer id_imovel;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "id_quarto")
    private Quarto quarto;
	@OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_foto")
	private List<Foto> fotos;
	@OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_contas")
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
	private String tipo_compartilhamento;
	@Column
	private String facilidades_imovel;
	@Column
	private Integer qtd_banheiro;
	@Column
	private Double metragem_imovel;
	@Column
	private String regras;
    @Column
	private Long mapa;
	@Column
	private String facilidades_regiao;
	@Column
	@DateTimeFormat
	private Date data_publicacao;
    
}
