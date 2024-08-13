package com.jpa.jpa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.jpa.entities.Person;
import java.util.List;



// LONG tipo de dato de la primary key
// Person es la entidad

public interface PersonRepositoty extends JpaRepository<Person, Long> {

    List<Person> findByProgrammingLanguage(String programmingLanguage);


    // CREO MI PROPIA CONSULTA
    @Query("select p from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<Person> buscarByProgrammingLanguage(String programmingLanguage, String name);

}
