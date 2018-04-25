package com.kramtey.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Submenu")
@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class Submenu implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long submenuId;
	
	private String submenuName;
}
