package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.Resource.Type;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Resource.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Resource_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Resource#baseUrls
	 **/
	public static volatile SingularAttribute<Resource, String> baseUrls;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Resource#name
	 **/
	public static volatile SingularAttribute<Resource, String> name;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Resource#description
	 **/
	public static volatile SingularAttribute<Resource, String> description;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Resource#id
	 **/
	public static volatile SingularAttribute<Resource, Integer> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Resource#type
	 **/
	public static volatile SingularAttribute<Resource, Type> type;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Resource
	 **/
	public static volatile EntityType<Resource> class_;

	public static final String BASE_URLS = "baseUrls";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String TYPE = "type";

}

