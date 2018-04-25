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
@Table(name="User")
@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private Long userId;
	
	private String userName;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private Long menuId;
	
	private Long subMenuId;
}
