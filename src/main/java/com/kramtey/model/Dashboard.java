package com.kramtey.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Entity
@Table(name = "dashboard")
//@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@ToString
//@EqualsAndHashCode
public class Dashboard {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String objectType;
	
	@Getter @Setter
	private String rawData;
	
	@Getter @Setter
	private int userId;
	
	@Getter @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
	private Date recordDate;
}
