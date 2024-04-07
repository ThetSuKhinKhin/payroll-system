package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationTarget;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(DeductionForFix.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DeductionForFix_ extends com.jdc.payroll.domain.master.entity.Deduction_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForFix#amount
	 **/
	public static volatile SingularAttribute<DeductionForFix, BigDecimal> amount;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForFix
	 **/
	public static volatile EntityType<DeductionForFix> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForFix#target
	 **/
	public static volatile SingularAttribute<DeductionForFix, CalculationTarget> target;

	public static final String AMOUNT = "amount";
	public static final String TARGET = "target";

}

