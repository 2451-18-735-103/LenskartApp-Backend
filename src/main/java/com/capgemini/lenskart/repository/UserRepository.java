package com.capgemini.lenskart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.lenskart.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	//void deleteById(User user);

	
}