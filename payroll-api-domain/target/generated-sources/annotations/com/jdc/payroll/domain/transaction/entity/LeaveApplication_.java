package com.jdc.payroll.domain.transaction.entity;

import com.jdc.payroll.domain.master.entity.Employee;
import com.jdc.payroll.domain.master.entity.LeaveType;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalDateTime;

@StaticMetamodel(LeaveApplication.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class LeaveApplication_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#endDate
	 **/
	public static volatile SingularAttribute<LeaveApplication, LocalDate> endDate;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#applyAt
	 **/
	public static volatile SingularAttribute<LeaveApplication, LocalDateTime> applyAt;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#remark
	 **/
	public static volatile SingularAttribute<LeaveApplication, String> remark;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#id
	 **/
	public static volatile SingularAttribute<LeaveApplication, Long> id;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#employee
	 **/
	public static volatile SingularAttribute<LeaveApplication, Employee> employee;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#type
	 **/
	public static volatile SingularAttribute<LeaveApplication, LeaveType> type;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication
	 **/
	public static volatile EntityType<LeaveApplication> class_;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.LeaveApplication#startDate
	 **/
	public static volatile SingularAttribute<LeaveApplication, LocalDate> startDate;

	public static final String END_DATE = "endDate";
	public static final String APPLY_AT = "applyAt";
	public static final String REMARK = "remark";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String TYPE = "type";
	public static final String START_DATE = "startDate";

}

