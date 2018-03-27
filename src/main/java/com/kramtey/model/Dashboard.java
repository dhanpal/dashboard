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
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Entity
@Table(name = "dashboard")
@EntityListeners(AuditingEntityListener.class)
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(fluent = true)
@Getter
@Setter
public class Dashboard {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	@NonNull
	private Long id;
	
	@NotBlank
	@Column(nullable = false)
	private String objectType;
	
	@NotBlank
	@Column(nullable = false)
	private String rawData;
	
	@NotBlank
	@Column(nullable = false)
	private int userId;
	
	@Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
	private Date recordDate;
}
