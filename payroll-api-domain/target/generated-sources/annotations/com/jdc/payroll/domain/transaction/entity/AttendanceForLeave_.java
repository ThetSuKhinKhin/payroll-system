package com.jdc.payroll.domain.transaction.entity;

import com.jdc.payroll.domain.transaction.entity.AttendanceForLeave.Type;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceForLeave.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AttendanceForLeave_ extends com.jdc.payroll.domain.transaction.entity.Attendance_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.AttendanceForLeave#application
	 **/
	public static volatile SingularAttribute<AttendanceForLeave, LeaveApplication> application;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.AttendanceForLeave#type
	 **/
	public static volatile SingularAttribute<AttendanceForLeave, Type> type;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.AttendanceForLeave
	 **/
	public static volatile EntityType<AttendanceForLeave> class_;

	public static final String APPLICATION = "application";
	public static final String TYPE = "type";

}

