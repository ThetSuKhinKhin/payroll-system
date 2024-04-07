package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationTarget;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(AllowanceForFix.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AllowanceForFix_ extends com.jdc.payroll.domain.master.entity.Allowance_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForFix#amount
	 **/
	public static volatile SingularAttribute<AllowanceForFix, BigDecimal> amount;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForFix
	 **/
	public static volatile EntityType<AllowanceForFix> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForFix#target
	 **/
	public static volatile SingularAttribute<AllowanceForFix, CalculationTarget> target;

	public static final String AMOUNT = "amount";
	public static final String TARGET = "target";

}

