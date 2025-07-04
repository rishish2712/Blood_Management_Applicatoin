package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User_Entity {
	
	private Integer id;
	
	@Id
	private Integer addhar;
	
	
	private String fullname;
	
	private String password;

	public User_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Entity(Integer id, Integer addhar, String fullname, String password) {
		super();
		this.id = id;
		this.addhar = addhar;
		this.fullname = fullname;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAddhar() {
		return addhar;
	}

	public void setAddhar(Integer addhar) {
		this.addhar = addhar;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User_Entity [id=" + id + ", addhar=" + addhar + ", fullname=" + fullname + ", password=" + password
				+ "]";
	}
	
	

}
