package com.jdc.payroll.domain.master.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Permissions.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Permissions_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions#modify
	 **/
	public static volatile SingularAttribute<Permissions, Boolean> modify;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions#read
	 **/
	public static volatile SingularAttribute<Permissions, Boolean> read;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions#resource
	 **/
	public static volatile SingularAttribute<Permissions, Resource> resource;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions#id
	 **/
	public static volatile SingularAttribute<Permissions, PermissionsPk> id;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions#position
	 **/
	public static volatile SingularAttribute<Permissions, Position> position;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions
	 **/
	public static volatile EntityType<Permissions> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Permissions#write
	 **/
	public static volatile SingularAttribute<Permissions, Boolean> write;

	public static final String MODIFY = "modify";
	public static final String READ = "read";
	public static final String RESOURCE = "resource";
	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String WRITE = "write";

}

