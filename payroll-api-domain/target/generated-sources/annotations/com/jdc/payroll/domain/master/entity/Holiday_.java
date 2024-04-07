package com.jdc.payroll.domain.master.entity;

import com.jdc.payroll.domain.master.entity.Holiday.Type;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Holiday.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Holiday_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Holiday#date
	 **/
	public static volatile SingularAttribute<Holiday, LocalDate> date;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Holiday#remark
	 **/
	public static volatile SingularAttribute<Holiday, String> remark;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Holiday#type
	 **/
	public static volatile SingularAttribute<Holiday, Type> type;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Holiday
	 **/
	public static volatile EntityType<Holiday> class_;
	
	/**
	 * @see com.jdc.payroll.domain.master.entity.Holiday#holiday
	 **/
	public static volatile SingularAttribute<Holiday, String> holiday;

	public static final String DATE = "date";
	public static final String REMARK = "remark";
	public static final String TYPE = "type";
	public static final String HOLIDAY = "holiday";

}

