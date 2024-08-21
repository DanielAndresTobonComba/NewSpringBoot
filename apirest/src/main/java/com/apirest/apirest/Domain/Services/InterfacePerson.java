package com.apirest.apirest.Domain.Services;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.apirest.apirest.Domain.Entities.Person;

public interface InterfacePerson {

    Page<Person> findAll(Pageable pageable);

    Optional<Person> findById(String id);

    Person createOne(Person person);
    
    Person updateOneById(String id , Person person); 

    Optional<Person> delete(String id);

}
