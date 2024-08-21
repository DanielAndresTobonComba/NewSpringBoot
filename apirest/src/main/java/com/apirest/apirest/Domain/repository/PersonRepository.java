package com.apirest.apirest.Domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apirest.Domain.Entities.Person;

public interface PersonRepository extends JpaRepository <Person , String> {


    // ACA IRIAN LAS QUERYS

    //  SI YO CREO UNA QUERY NATIVA ACA DEBO COLOCARLA EN LA INTERFAZ QUE ES IMPLEMENTADA

    
}
