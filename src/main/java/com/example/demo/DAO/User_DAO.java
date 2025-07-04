package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User_Entity;

@Repository
public interface User_DAO extends CrudRepository<User_Entity, Integer>  {

	Iterable<User_Entity> findAllById(Integer addhar);

}
