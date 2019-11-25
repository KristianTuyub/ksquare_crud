package com.ksquare.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksquare.core.entity.Person;

@Repository("PersonRepository")
public interface PersonRepository extends JpaRepository<Person, Serializable>{
	public abstract Person findByPersonId(long personId);
}
