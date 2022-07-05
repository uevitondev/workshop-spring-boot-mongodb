package com.uevitondev.workshopmongo.dto;

import java.io.Serializable;

import com.uevitondev.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;

	public AuthorDTO() {

	}

	public AuthorDTO(User Obj) {
		id = Obj.getId();
		name = Obj.getName();
	}

	public AuthorDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
