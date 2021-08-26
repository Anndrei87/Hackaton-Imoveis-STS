package com.darahimoveis.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.darahimoveis.model.Imovel;

public class ImovelSpecification implements Specification<Imovel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7933231654541090894L;

	@Override
	public Predicate toPredicate(Root<Imovel> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

}
