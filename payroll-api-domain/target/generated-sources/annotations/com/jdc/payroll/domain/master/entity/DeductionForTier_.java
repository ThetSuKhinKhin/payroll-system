package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DeductionForTier.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DeductionForTier_ extends com.jdc.payroll.domain.master.entity.Deduction_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForTier
	 **/
	public static volatile EntityType<DeductionForTier> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.DeductionForTier#items
	 **/
	public static volatile ListAttribute<DeductionForTier, TierItem> items;

	public static final String ITEMS = "items";

}

