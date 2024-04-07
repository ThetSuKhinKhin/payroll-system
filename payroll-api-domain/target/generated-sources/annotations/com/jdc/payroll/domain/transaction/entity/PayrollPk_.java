package com.jdc.payroll.domain.transaction.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.YearMonth;

@StaticMetamodel(PayrollPk.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PayrollPk_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollPk#payMonth
	 **/
	public static volatile SingularAttribute<PayrollPk, YearMonth> payMonth;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollPk
	 **/
	public static volatile EmbeddableType<PayrollPk> class_;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollPk#employeeCode
	 **/
	public static volatile SingularAttribute<PayrollPk, String> employeeCode;

	public static final String PAY_MONTH = "payMonth";
	public static final String EMPLOYEE_CODE = "employeeCode";

}

