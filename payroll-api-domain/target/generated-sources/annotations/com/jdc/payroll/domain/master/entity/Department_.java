package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Department.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Department_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department#code
	 **/
	public static volatile SingularAttribute<Department, String> code;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department#headOfDepartment
	 **/
	public static volatile SingularAttribute<Department, Employee> headOfDepartment;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department#name
	 **/
	public static volatile SingularAttribute<Department, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department#description
	 **/
	public static volatile SingularAttribute<Department, String> description;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department#positions
	 **/
	public static volatile ListAttribute<Department, Position> positions;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department#employees
	 **/
	public static volatile ListAttribute<Department, Employee> employees;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Department
	 **/
	public static volatile EntityType<Department> class_;

	public static final String CODE = "code";
	public static final String HEAD_OF_DEPARTMENT = "headOfDepartment";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String POSITIONS = "positions";
	public static final String EMPLOYEES = "employees";

}

