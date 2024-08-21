package com.apirest.apirest.Domain.Services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apirest.apirest.Domain.Entities.Person;
import com.apirest.apirest.Domain.Services.InterfacePerson;
import com.apirest.apirest.Domain.repository.PersonRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class PersonImpl implements InterfacePerson {


    @Autowired 
    private PersonRepository personRepository ;

    @Override
    public Page<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    } 

    @Override
    @Transactional(readOnly = true)
    public Optional<Person> findById(String id) {
        return personRepository.findById(id);
    }

    @Override
    public Person createOne(Person person) {
        
        return personRepository.save(person);
    }

    @Override
    public Person updateOneById(String id, Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOneById'");
    }

    @Override
    public Optional<Person> delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }





}
