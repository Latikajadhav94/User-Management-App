package com.bikkadIt.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.Entity.StateMasterEntity;
import com.bikkadIt.Entity.UserAcccountEntity;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAcccountEntity, Serializable>{

	public UserAcccountEntity findByEmailAndPassword(String email, String password);
	
	

}
