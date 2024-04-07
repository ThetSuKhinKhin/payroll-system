package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.Account.Role;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Account_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#password
	 **/
	public static volatile SingularAttribute<Account, String> password;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#role
	 **/
	public static volatile SingularAttribute<Account, Role> role;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#name
	 **/
	public static volatile SingularAttribute<Account, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#id
	 **/
	public static volatile SingularAttribute<Account, Long> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#employee
	 **/
	public static volatile SingularAttribute<Account, Employee> employee;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account
	 **/
	public static volatile EntityType<Account> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#username
	 **/
	public static volatile SingularAttribute<Account, String> username;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Account#activated
	 **/
	public static volatile SingularAttribute<Account, Boolean> activated;

	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String USERNAME = "username";
	public static final String ACTIVATED = "activated";

}

