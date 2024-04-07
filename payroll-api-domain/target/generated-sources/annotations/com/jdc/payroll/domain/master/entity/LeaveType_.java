package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(LeaveType.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class LeaveType_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.LeaveType#name
	 **/
	public static volatile SingularAttribute<LeaveType, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.LeaveType#remark
	 **/
	public static volatile SingularAttribute<LeaveType, String> remark;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.LeaveType#id
	 **/
	public static volatile SingularAttribute<LeaveType, Integer> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.LeaveType
	 **/
	public static volatile EntityType<LeaveType> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.LeaveType#paidDays
	 **/
	public static volatile SingularAttribute<LeaveType, Integer> paidDays;

	public static final String NAME = "name";
	public static final String REMARK = "remark";
	public static final String ID = "id";
	public static final String PAID_DAYS = "paidDays";

}

