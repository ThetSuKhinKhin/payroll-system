package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Settings.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Settings_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Settings#cutOffDay
	 **/
	public static volatile SingularAttribute<Settings, Integer> cutOffDay;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Settings#payDay
	 **/
	public static volatile SingularAttribute<Settings, Integer> payDay;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Settings#effectAt
	 **/
	public static volatile SingularAttribute<Settings, LocalDate> effectAt;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Settings#id
	 **/
	public static volatile SingularAttribute<Settings, Integer> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Settings
	 **/
	public static volatile EntityType<Settings> class_;

	public static final String CUT_OFF_DAY = "cutOffDay";
	public static final String PAY_DAY = "payDay";
	public static final String EFFECT_AT = "effectAt";
	public static final String ID = "id";

}

