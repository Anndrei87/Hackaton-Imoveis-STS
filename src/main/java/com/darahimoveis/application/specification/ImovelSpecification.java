package com.darahimoveis.application.specification;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.darahimoveis.application.model.Imovel;

public class ImovelSpecification implements Specification<Imovel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7933231654541090894L;

	private Integer id_imovel;
    private Integer id_usuario;
    private Integer id_quarto;
	private Integer id_foto;
	private Integer cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String tipo_imovel;
	private String tipo_compartilhamento;
	private Double aluguel;
	private Double condominio;
	private Double internet;
	private Double tv_cabo;
    private Double agua;
    private Double energia;
	private Double gas;
	private String facilidades_imovel;
	private Integer qtd_banheiro;
	private Double metragem_imovel;
	private String regras;
	private Long mapa;
	private String facilidades_regiao;
	private Date data_publicacao;
	
	@Override
	public Predicate toPredicate(Root<Imovel> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		
		ArrayList<Predicate> predicates = new ArrayList<Predicate>();
		
		if(this.id_imovel != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("id_imovel"), id_imovel);
			predicates.add(predicate);
		}
		if(this.id_usuario != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("id_usuario"), id_usuario);
			predicates.add(predicate);
		}
		if(this.id_quarto != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("id_quarto"), id_quarto);
			predicates.add(predicate);
		}
		if(this.id_foto != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("id_foto"), id_foto);
			predicates.add(predicate);
		}
		if(this.cep != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("cep"), cep);
			predicates.add(predicate);
		}
		if(this.logradouro != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("logradouro"), logradouro);
			predicates.add(predicate);
		}
		if(this.numero != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("numero"), numero);
			predicates.add(predicate);
		}
		if(this.complemento != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("complemento"), complemento);
			predicates.add(predicate);
		}
		if(this.bairro != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("bairro"), bairro);
			predicates.add(predicate);
		}
		if(this.cidade != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("cidade"), cidade);
			predicates.add(predicate);
		}
		if(this.estado != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("estado"), estado);
			predicates.add(predicate);
		}
		if(this.tipo_imovel != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("tipo_imovel"), tipo_imovel);
			predicates.add(predicate);
		}
		if(this.tipo_compartilhamento != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("tipo_compartilhamento"), tipo_compartilhamento);
			predicates.add(predicate);
		}
		if(this.aluguel != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("aluguel"), aluguel);
			predicates.add(predicate);
		}
		if(this.condominio != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("condominio"), condominio);
			predicates.add(predicate);
		}
		if(this.internet != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("internet"), internet);
			predicates.add(predicate);
		}
		if(this.tv_cabo != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("tv_cabo"), tv_cabo);
			predicates.add(predicate);
		}
		if(this.agua != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("agua"), agua);
			predicates.add(predicate);
		}
		if(this.energia != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("energia"), energia);
			predicates.add(predicate);
		}
		if(this.gas != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("gas"), gas);
			predicates.add(predicate);
		}
		if(this.facilidades_imovel != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("facilidades_imovel"), facilidades_imovel);
			predicates.add(predicate);
		}
		if(this.qtd_banheiro != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("qtd_banheiro"), qtd_banheiro);
			predicates.add(predicate);
		}
		if(this.metragem_imovel != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("metragem_imovel"), metragem_imovel);
			predicates.add(predicate);
		}
		if(this.regras != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("regras"), regras);
			predicates.add(predicate);
		}
		if(this.mapa != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("mapa"), mapa);
			predicates.add(predicate);
		}
		if(this.facilidades_regiao != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("facilidades_regiao"), facilidades_regiao);
			predicates.add(predicate);
		}
		if(this.data_publicacao != null) {			
			Predicate predicate = criteriaBuilder.equal(root.get("data_publicacao"), data_publicacao);
			predicates.add(predicate);
		}
		
		Predicate[] arrayPredicates = predicates.toArray(new Predicate[predicates.size()]);
		return criteriaBuilder.and(arrayPredicates);
	}

}
