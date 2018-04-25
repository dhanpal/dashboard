package com.kramtey.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.kramtey.model.Menu;
import com.kramtey.model.Submenu;
import com.kramtey.model.User;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class UserDetailsResponse {
	
	private User user;

	private List<Menu> menu;
	
	private List<Submenu> submenu;
}