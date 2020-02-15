package com.car.carDDD.infrastructure.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class baseDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateCreation")
	@Getter
	@Setter
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateUpdate")
	@Getter
	@Setter
	private Date dateUpdate;
	
	public baseDto() {}
	
}
