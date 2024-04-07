package com.jdc.payroll.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.MappedSuperclassType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(AbstractEntity.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.AbstractEntity#createBy
	 **/
	public static volatile SingularAttribute<AbstractEntity, String> createBy;
	
	/**
	 * @see com.jdc.payroll.domain.AbstractEntity#deleted
	 **/
	public static volatile SingularAttribute<AbstractEntity, Boolean> deleted;
	
	/**
	 * @see com.jdc.payroll.domain.AbstractEntity#updateBy
	 **/
	public static volatile SingularAttribute<AbstractEntity, String> updateBy;
	
	/**
	 * @see com.jdc.payroll.domain.AbstractEntity#updateAt
	 **/
	public static volatile SingularAttribute<AbstractEntity, LocalDateTime> updateAt;
	
	/**
	 * @see com.jdc.payroll.domain.AbstractEntity
	 **/
	public static volatile MappedSuperclassType<AbstractEntity> class_;
	
	/**
	 * @see com.jdc.payroll.domain.AbstractEntity#createAt
	 **/
	public static volatile SingularAttribute<AbstractEntity, LocalDateTime> createAt;

	public static final String CREATE_BY = "createBy";
	public static final String DELETED = "deleted";
	public static final String UPDATE_BY = "updateBy";
	public static final String UPDATE_AT = "updateAt";
	public static final String CREATE_AT = "createAt";

}

