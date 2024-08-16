
package com.apirest.apirest.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_persons")

public class TypePerson {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 


    // EL LENGTH SE TOMA COMO STRING Y EL COLUMNDEFINITION SE USA PARA ESPCIFICAR EL TIPO DE DATO
    @Column(columnDefinition = "VARCHAR(100)" , nullable = false)
    private String description;



    public TypePerson() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    
    
    
}
