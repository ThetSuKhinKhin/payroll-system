package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationType;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Deduction.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Deduction_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Deduction#name
	 **/
	public static volatile SingularAttribute<Deduction, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Deduction#description
	 **/
	public static volatile SingularAttribute<Deduction, String> description;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Deduction#id
	 **/
	public static volatile SingularAttribute<Deduction, Integer> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Deduction#type
	 **/
	public static volatile SingularAttribute<Deduction, CalculationType> type;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Deduction
	 **/
	public static volatile EntityType<Deduction> class_;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String TYPE = "type";

}

