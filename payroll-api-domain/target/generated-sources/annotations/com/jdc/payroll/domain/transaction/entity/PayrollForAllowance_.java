package com.jdc.payroll.domain.transaction.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(PayrollForAllowance.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PayrollForAllowance_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance#totalAmount
	 **/
	public static volatile SingularAttribute<PayrollForAllowance, BigDecimal> totalAmount;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance#times
	 **/
	public static volatile SingularAttribute<PayrollForAllowance, Integer> times;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance#unitAmount
	 **/
	public static volatile SingularAttribute<PayrollForAllowance, BigDecimal> unitAmount;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance#particular
	 **/
	public static volatile SingularAttribute<PayrollForAllowance, String> particular;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance#id
	 **/
	public static volatile SingularAttribute<PayrollForAllowance, PayrollForItemPk> id;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance#payroll
	 **/
	public static volatile SingularAttribute<PayrollForAllowance, Payroll> payroll;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.PayrollForAllowance
	 **/
	public static volatile EntityType<PayrollForAllowance> class_;

	public static final String TOTAL_AMOUNT = "totalAmount";
	public static final String TIMES = "times";
	public static final String UNIT_AMOUNT = "unitAmount";
	public static final String PARTICULAR = "particular";
	public static final String ID = "id";
	public static final String PAYROLL = "payroll";

}

