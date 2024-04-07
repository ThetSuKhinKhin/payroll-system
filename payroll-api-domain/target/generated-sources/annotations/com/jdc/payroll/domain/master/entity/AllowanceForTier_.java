package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AllowanceForTier.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AllowanceForTier_ extends com.jdc.payroll.domain.master.entity.Allowance_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForTier
	 **/
	public static volatile EntityType<AllowanceForTier> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.AllowanceForTier#items
	 **/
	public static volatile ListAttribute<AllowanceForTier, TierItem> items;

	public static final String ITEMS = "items";

}

