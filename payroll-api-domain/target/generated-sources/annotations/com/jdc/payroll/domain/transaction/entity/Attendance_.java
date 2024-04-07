package com.jdc.payroll.domain.transaction.entity;

import com.jdc.payroll.domain.transaction.entity.Attendance.Status;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalTime;

@StaticMetamodel(Attendance.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Attendance_ extends com.jdc.payroll.domain.AbstractEntity_ {

	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Attendance#checkIn
	 **/
	public static volatile SingularAttribute<Attendance, LocalTime> checkIn;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Attendance#remark
	 **/
	public static volatile SingularAttribute<Attendance, String> remark;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Attendance#id
	 **/
	public static volatile SingularAttribute<Attendance, AttendancePk> id;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Attendance#checkOut
	 **/
	public static volatile SingularAttribute<Attendance, LocalTime> checkOut;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Attendance
	 **/
	public static volatile EntityType<Attendance> class_;
	
	/**
	 * @see com.jdc.payroll.domain.transaction.entity.Attendance#status
	 **/
	public static volatile SingularAttribute<Attendance, Status> status;

	public static final String CHECK_IN = "checkIn";
	public static final String REMARK = "remark";
	public static final String ID = "id";
	public static final String CHECK_OUT = "checkOut";
	public static final String STATUS = "status";

}

