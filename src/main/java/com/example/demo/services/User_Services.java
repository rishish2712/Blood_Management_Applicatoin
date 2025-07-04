package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.User_DAO;
import com.example.demo.Entity.User_Entity;

@Service
public class User_Services {
	
	@Autowired
	private User_DAO userdao;
	
	public void save() {
		userdao.save(null);
	}
	
	public Iterable<User_Entity> find(Integer addhar){
		return userdao.findAllById(addhar);
	}
	

}
