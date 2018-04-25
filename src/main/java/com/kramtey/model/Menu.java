package com.kramtey.model;

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
@Table(name = "Menu")
@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class Menu {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long menuId;
	
	private String menuName;
}
