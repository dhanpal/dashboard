package com.kramtey.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Dashboard")
@NoArgsConstructor
@ToString
@JsonInclude(Include.NON_NULL)
public class Dashboard {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private User user;
	
	@Getter @Setter
	private Tab tab;
	
	@Getter @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
	private Date recordDate;
}
