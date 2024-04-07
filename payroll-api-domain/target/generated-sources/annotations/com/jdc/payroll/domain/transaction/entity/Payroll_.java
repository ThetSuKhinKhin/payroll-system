package com.jdc.payroll.domain.transaction.entity;

import com.jdc.payroll.domain.master.entity.Employee;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(Payroll.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Payroll_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Payroll#totalAllowance
	 **/
	public static volatile SingularAttribute<Payroll, BigDecimal> totalAllowance;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Payroll#totalDeduction
	 **/
	public static volatile SingularAttribute<Payroll, BigDecimal> totalDeduction;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Payroll#baseSalary
	 **/
	public static volatile SingularAttribute<Payroll, BigDecimal> baseSalary;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Payroll#id
	 **/
	public static volatile SingularAttribute<Payroll, PayrollPk> id;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Payroll#employee
	 **/
	public static volatile SingularAttribute<Payroll, Employee> employee;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Payroll
	 **/
	public static volatile EntityType<Payroll> class_;

	public static final String TOTAL_ALLOWANCE = "totalAllowance";
	public static final String TOTAL_DEDUCTION = "totalDeduction";
	public static final String BASE_SALARY = "baseSalary";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";

}

