package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.CalculationTarget;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(TierItem.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class TierItem_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.TierItem#rangeTo
	 **/
	public static volatile SingularAttribute<TierItem, BigDecimal> rangeTo;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.TierItem#amount
	 **/
	public static volatile SingularAttribute<TierItem, BigDecimal> amount;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.TierItem#rangeFrom
	 **/
	public static volatile SingularAttribute<TierItem, BigDecimal> rangeFrom;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.TierItem
	 **/
	public static volatile EmbeddableType<TierItem> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.TierItem#percent
	 **/
	public static volatile SingularAttribute<TierItem, Boolean> percent;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.TierItem#target
	 **/
	public static volatile SingularAttribute<TierItem, CalculationTarget> target;

	public static final String RANGE_TO = "rangeTo";
	public static final String AMOUNT = "amount";
	public static final String RANGE_FROM = "rangeFrom";
	public static final String PERCENT = "percent";
	public static final String TARGET = "target";

}

