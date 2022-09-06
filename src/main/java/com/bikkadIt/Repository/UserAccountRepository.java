package com.bikkadIt.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.Entity.StateMasterEntity;

@Repository
public interface UserAccountRepository extends JpaRepository<StateMasterEntity, Serializable>{

}