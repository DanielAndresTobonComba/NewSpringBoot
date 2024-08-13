package com.jpa.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons") // Definir nombre de la tabla que esta en la db y se relacione con la entidad en Person
public class Person {


    // Proceso para crear un autoincremental
    @Id // Decir que es la llave primaria 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Este atributo tomara el autoincremental

    @Column(columnDefinition = "VARCHAR(50)" , nullable = false)
    private String name; 

    @Column(columnDefinition = "VARCHAR(50)" , nullable = false)
    private String lastname;

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", lastname=" + lastname + ", programmingLanguage="
                + programmingLanguage + "]";
    }

    @Column(columnDefinition = "VARCHAR(50)" , nullable = true)
    private String programmingLanguage;
    
    public Person() {
    }

    public Person(Long id, String name, String lastname, String programmingLanguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programmingLanguage = programmingLanguage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    
    

}
