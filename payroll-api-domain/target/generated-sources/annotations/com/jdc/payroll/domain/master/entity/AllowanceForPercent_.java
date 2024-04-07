package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationTarget;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(AllowanceForPercent.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AllowanceForPercent_ extends com.jdc.payroll.domain.master.entity.Allowance_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForPercent#amount
	 **/
	public static volatile SingularAttribute<AllowanceForPercent, BigDecimal> amount;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForPercent
	 **/
	public static volatile EntityType<AllowanceForPercent> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForPercent#target
	 **/
	public static volatile SingularAttribute<AllowanceForPercent, CalculationTarget> target;

	public static final String AMOUNT = "amount";
	public static final String TARGET = "target";

}

