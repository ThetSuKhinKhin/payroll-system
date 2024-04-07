package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(EmployeeHistoryPk.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class EmployeeHistoryPk_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistoryPk#changeAt
	 **/
	public static volatile SingularAttribute<EmployeeHistoryPk, LocalDateTime> changeAt;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistoryPk
	 **/
	public static volatile EmbeddableType<EmployeeHistoryPk> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.EmployeeHistoryPk#employeeCode
	 **/
	public static volatile SingularAttribute<EmployeeHistoryPk, String> employeeCode;

	public static final String CHANGE_AT = "changeAt";
	public static final String EMPLOYEE_CODE = "employeeCode";

}

