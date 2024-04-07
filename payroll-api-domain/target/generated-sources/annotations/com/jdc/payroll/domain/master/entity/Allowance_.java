package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationType;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Allowance.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Allowance_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Allowance#name
	 **/
	public static volatile SingularAttribute<Allowance, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Allowance#description
	 **/
	public static volatile SingularAttribute<Allowance, String> description;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Allowance#id
	 **/
	public static volatile SingularAttribute<Allowance, Integer> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Allowance#type
	 **/
	public static volatile SingularAttribute<Allowance, CalculationType> type;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Allowance
	 **/
	public static volatile EntityType<Allowance> class_;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String TYPE = "type";

}

