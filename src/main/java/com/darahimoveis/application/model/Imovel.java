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
    @Column
//    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Integer id_usuario;
    @Column
//    @OneToOne
    @JoinColumn(name = "id_quarto")
    private Integer id_quarto;
	@Column
//	@OneToMany(fetch = FetchType.EAGER, mappedBy="imovel")
    @JoinColumn(name = "id_foto")
	private Integer id_foto;
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
	private Double aluguel;
    @Column
	private Double condominio;
	@Column
	private Double internet;
	@Column
	private Double tv_cabo;
	@Column
    private Double agua;
    @Column
    private Double energia;
	@Column
	private Double gas;
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
