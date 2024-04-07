package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.Employee.Gender;
import com.jdc.payroll.domain.master.entity.Employee.Status;
import com.jdc.payroll.domain.master.entity.EmployeeHistory.Type;
import com.jdc.payroll.domain.master.entity.PositionPk.PositionCode;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(EmployeeHistory.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class EmployeeHistory_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#departmentName
	 **/
	public static volatile SingularAttribute<EmployeeHistory, String> departmentName;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#gender
	 **/
	public static volatile SingularAttribute<EmployeeHistory, Gender> gender;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#assignDate
	 **/
	public static volatile SingularAttribute<EmployeeHistory, LocalDate> assignDate;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#departmentCode
	 **/
	public static volatile SingularAttribute<EmployeeHistory, String> departmentCode;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#provationPassDate
	 **/
	public static volatile SingularAttribute<EmployeeHistory, LocalDate> provationPassDate;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#dateOfBirth
	 **/
	public static volatile SingularAttribute<EmployeeHistory, LocalDate> dateOfBirth;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#remark
	 **/
	public static volatile SingularAttribute<EmployeeHistory, String> remark;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#retireDate
	 **/
	public static volatile SingularAttribute<EmployeeHistory, LocalDate> retireDate;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#type
	 **/
	public static volatile SingularAttribute<EmployeeHistory, Type> type;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#employee
	 **/
	public static volatile SingularAttribute<EmployeeHistory, Employee> employee;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#phone
	 **/
	public static volatile SingularAttribute<EmployeeHistory, String> phone;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#name
	 **/
	public static volatile SingularAttribute<EmployeeHistory, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#id
	 **/
	public static volatile SingularAttribute<EmployeeHistory, EmployeeHistoryPk> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#position
	 **/
	public static volatile SingularAttribute<EmployeeHistory, PositionCode> position;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory
	 **/
	public static volatile EntityType<EmployeeHistory> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#email
	 **/
	public static volatile SingularAttribute<EmployeeHistory, String> email;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistory#status
	 **/
	public static volatile SingularAttribute<EmployeeHistory, Status> status;

	public static final String DEPARTMENT_NAME = "departmentName";
	public static final String GENDER = "gender";
	public static final String ASSIGN_DATE = "assignDate";
	public static final String DEPARTMENT_CODE = "departmentCode";
	public static final String PROVATION_PASS_DATE = "provationPassDate";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String REMARK = "remark";
	public static final String RETIRE_DATE = "retireDate";
	public static final String TYPE = "type";
	public static final String EMPLOYEE = "employee";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";

}

