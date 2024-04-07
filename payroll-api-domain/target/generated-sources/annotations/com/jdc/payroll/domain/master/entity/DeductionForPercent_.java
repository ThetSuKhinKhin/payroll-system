package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationTarget;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(DeductionForPercent.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DeductionForPercent_ extends com.jdc.payroll.domain.master.entity.Deduction_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForPercent#amount
	 **/
	public static volatile SingularAttribute<DeductionForPercent, BigDecimal> amount;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForPercent
	 **/
	public static volatile EntityType<DeductionForPercent> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForPercent#target
	 **/
	public static volatile SingularAttribute<DeductionForPercent, CalculationTarget> target;

	public static final String AMOUNT = "amount";
	public static final String TARGET = "target";

}

