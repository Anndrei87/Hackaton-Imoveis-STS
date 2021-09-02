package com.darahimoveis.application.specification;

import java.util.ArrayList;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.darahimoveis.application.model.Contas;

public class ContasSpecification implements Specification<Contas>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8344340164780959906L;
	
	private Double aluguel;
	private Double condominio;
	private Double internet;
	private Double tv_cabo;
    private Double agua;
    private Double energia;
	private Double gas;
	
	@Override
	public Predicate toPredicate(Root<Contas> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		
		ArrayList<Predicate> predicates = new ArrayList<Predicate>();
		
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
		
		Predicate[] arrayPredicates = predicates.toArray(new Predicate[predicates.size()]);
		return criteriaBuilder.and(arrayPredicates);
	}
}
