package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.PositionPk.PositionCode;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PermissionsPk.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PermissionsPk_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PermissionsPk#resourceId
	 **/
	public static volatile SingularAttribute<PermissionsPk, Integer> resourceId;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PermissionsPk#departmentCode
	 **/
	public static volatile SingularAttribute<PermissionsPk, String> departmentCode;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PermissionsPk#positionCode
	 **/
	public static volatile SingularAttribute<PermissionsPk, PositionCode> positionCode;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.PermissionsPk
	 **/
	public static volatile EmbeddableType<PermissionsPk> class_;

	public static final String RESOURCE_ID = "resourceId";
	public static final String DEPARTMENT_CODE = "departmentCode";
	public static final String POSITION_CODE = "positionCode";

}

