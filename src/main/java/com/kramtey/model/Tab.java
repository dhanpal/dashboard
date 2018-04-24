package com.kramtey.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Horizontaltabs")
@NoArgsConstructor
@ToString
@JsonInclude(Include.NON_NULL)
public class Tab implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String tabName;
	
	@Getter @Setter
	private String tabType;
	
	private enum TabTypes{
		HORIZONTAL,
		VERTICAL
	}
}
