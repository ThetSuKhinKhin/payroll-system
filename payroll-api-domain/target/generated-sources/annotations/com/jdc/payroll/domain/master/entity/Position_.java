package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(Position.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Position_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#otFeesPerHour
	 **/
	public static volatile SingularAttribute<Position, BigDecimal> otFeesPerHour;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#anualLeaves
	 **/
	public static volatile SingularAttribute<Position, Integer> anualLeaves;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#basicSalary
	 **/
	public static volatile SingularAttribute<Position, BigDecimal> basicSalary;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#permissions
	 **/
	public static volatile ListAttribute<Position, Permissions> permissions;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#id
	 **/
	public static volatile SingularAttribute<Position, PositionPk> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#department
	 **/
	public static volatile SingularAttribute<Position, Department> department;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position#employees
	 **/
	public static volatile ListAttribute<Position, Employee> employees;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Position
	 **/
	public static volatile EntityType<Position> class_;

	public static final String OT_FEES_PER_HOUR = "otFeesPerHour";
	public static final String ANUAL_LEAVES = "anualLeaves";
	public static final String BASIC_SALARY = "basicSalary";
	public static final String PERMISSIONS = "permissions";
	public static final String ID = "id";
	public static final String DEPARTMENT = "department";
	public static final String EMPLOYEES = "employees";

}

