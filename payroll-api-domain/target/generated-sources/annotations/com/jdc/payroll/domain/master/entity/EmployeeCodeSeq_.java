package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(EmployeeCodeSeq.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class EmployeeCodeSeq_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeCodeSeq#seqNumber
	 **/
	public static volatile SingularAttribute<EmployeeCodeSeq, Integer> seqNumber;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeCodeSeq#department
	 **/
	public static volatile SingularAttribute<EmployeeCodeSeq, String> department;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeCodeSeq
	 **/
	public static volatile EntityType<EmployeeCodeSeq> class_;

	public static final String SEQ_NUMBER = "seqNumber";
	public static final String DEPARTMENT = "department";

}

