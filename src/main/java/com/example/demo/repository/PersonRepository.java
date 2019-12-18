package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Person;

@Repository
@Transactional
public interface PersonRepository extends CrudRepository <Person, String>{

	
}
