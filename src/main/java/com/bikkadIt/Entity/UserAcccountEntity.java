package com.bikkadIt.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="USER_ACCOUNT")
@Data
public class UserAcccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USer_ID")
	private Integer userId;
	
	@Column(name = "FIRST_Name")
	private String fname;
	@Column(name = "LAST_NAME")
	private String lname;
	@Column(name = "USer_EMAIL")
	private String email;
	@Column(name = "USer_PWD")
	private String password;
	@Column(name = "USer_PHONENO")
	private Long phno;
	@Column(name = "USer_DOB")
	private LocalDate dob;
	@Column(name = "USer_GENDER")
	private String gender;
	@Column(name = "USer_CITYID")
	private Integer cityId;
	@Column(name = "USer_STATEID")
	private Integer stateId;
	@Column(name = "USer_COUNTRYID")
	private Integer countryId;
	@Column(name = "USer_ACCSTATUS")
	private String accStatus;
	
	@CreationTimestamp
	@Column(name = "CREATED_DATE",updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE", insertable = false)
	private LocalDate updatedDate;
	
	
}
