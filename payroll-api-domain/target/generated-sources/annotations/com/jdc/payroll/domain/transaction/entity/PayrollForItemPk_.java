package com.jdc.payroll.domain.transaction.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.YearMonth;

@StaticMetamodel(PayrollForItemPk.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PayrollForItemPk_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForItemPk#payMonth
	 **/
	public static volatile SingularAttribute<PayrollForItemPk, YearMonth> payMonth;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForItemPk#seqNumber
	 **/
	public static volatile SingularAttribute<PayrollForItemPk, Integer> seqNumber;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForItemPk
	 **/
	public static volatile EmbeddableType<PayrollForItemPk> class_;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForItemPk#employeeCode
	 **/
	public static volatile SingularAttribute<PayrollForItemPk, String> employeeCode;

	public static final String PAY_MONTH = "payMonth";
	public static final String SEQ_NUMBER = "seqNumber";
	public static final String EMPLOYEE_CODE = "employeeCode";

}

