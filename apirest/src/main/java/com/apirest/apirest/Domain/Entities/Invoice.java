package com.apirest.apirest.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {


    // AUTOINCREMENTAL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // aqui toma el nombre del atributo de clase para llamarse asi en la db 
    @Column(columnDefinition = "TEXT" , nullable = true)
    private String description;


    @Column(columnDefinition = "DECIMAL(10,2)" , nullable = false)
    private Long total;


    @ManyToOne 
    private Person person;

    

    public Invoice() {
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


    public Long getTotal() {
        return total;
    }


    public void setTotal(Long total) {
        this.total = total;
    }

    

}
