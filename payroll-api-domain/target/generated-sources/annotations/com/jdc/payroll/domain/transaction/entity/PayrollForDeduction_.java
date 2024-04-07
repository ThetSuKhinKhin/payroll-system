package com.jdc.payroll.domain.transaction.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(PayrollForDeduction.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PayrollForDeduction_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction#totalAmount
	 **/
	public static volatile SingularAttribute<PayrollForDeduction, BigDecimal> totalAmount;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction#times
	 **/
	public static volatile SingularAttribute<PayrollForDeduction, Integer> times;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction#unitAmount
	 **/
	public static volatile SingularAttribute<PayrollForDeduction, BigDecimal> unitAmount;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction#particular
	 **/
	public static volatile SingularAttribute<PayrollForDeduction, String> particular;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction#id
	 **/
	public static volatile SingularAttribute<PayrollForDeduction, PayrollForItemPk> id;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction#payroll
	 **/
	public static volatile SingularAttribute<PayrollForDeduction, Payroll> payroll;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForDeduction
	 **/
	public static volatile EntityType<PayrollForDeduction> class_;

	public static final String TOTAL_AMOUNT = "totalAmount";
	public static final String TIMES = "times";
	public static final String UNIT_AMOUNT = "unitAmount";
	public static final String PARTICULAR = "particular";
	public static final String ID = "id";
	public static final String PAYROLL = "payroll";

}

