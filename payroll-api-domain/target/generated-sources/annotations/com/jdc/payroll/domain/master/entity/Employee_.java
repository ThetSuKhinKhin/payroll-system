package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.Employee.Gender;
import com.jdc.payroll.domain.master.entity.Employee.Status;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Employee.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Employee_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#code
	 **/
	public static volatile SingularAttribute<Employee, String> code;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#gender
	 **/
	public static volatile SingularAttribute<Employee, Gender> gender;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#assignDate
	 **/
	public static volatile SingularAttribute<Employee, LocalDate> assignDate;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#provationPassDate
	 **/
	public static volatile SingularAttribute<Employee, LocalDate> provationPassDate;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#dateOfBirth
	 **/
	public static volatile SingularAttribute<Employee, LocalDate> dateOfBirth;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#remark
	 **/
	public static volatile SingularAttribute<Employee, String> remark;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#retireDate
	 **/
	public static volatile SingularAttribute<Employee, LocalDate> retireDate;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#history
	 **/
	public static volatile ListAttribute<Employee, EmployeeHistory> history;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#phone
	 **/
	public static volatile SingularAttribute<Employee, String> phone;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#position
	 **/
	public static volatile SingularAttribute<Employee, Position> position;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#department
	 **/
	public static volatile SingularAttribute<Employee, Department> department;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee
	 **/
	public static volatile EntityType<Employee> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#account
	 **/
	public static volatile SingularAttribute<Employee, Account> account;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#email
	 **/
	public static volatile SingularAttribute<Employee, String> email;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Employee#status
	 **/
	public static volatile SingularAttribute<Employee, Status> status;

	public static final String CODE = "code";
	public static final String GENDER = "gender";
	public static final String ASSIGN_DATE = "assignDate";
	public static final String PROVATION_PASS_DATE = "provationPassDate";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String REMARK = "remark";
	public static final String RETIRE_DATE = "retireDate";
	public static final String HISTORY = "history";
	public static final String PHONE = "phone";
	public static final String POSITION = "position";
	public static final String DEPARTMENT = "department";
	public static final String ACCOUNT = "account";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";

}

