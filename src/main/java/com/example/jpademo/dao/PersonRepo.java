package com.example.jpademo.dao;

import java.util.List;

import com.example.jpademo.model.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Integer> {
    List<Person> findByName(String name);
}
