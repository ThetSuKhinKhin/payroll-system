package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.PositionPk.PositionCode;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PositionPk.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PositionPk_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PositionPk#departmentCode
	 **/
	public static volatile SingularAttribute<PositionPk, String> departmentCode;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PositionPk#positionCode
	 **/
	public static volatile SingularAttribute<PositionPk, PositionCode> positionCode;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PositionPk
	 **/
	public static volatile EmbeddableType<PositionPk> class_;

	public static final String DEPARTMENT_CODE = "departmentCode";
	public static final String POSITION_CODE = "positionCode";

}

