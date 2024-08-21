package com.apirest.apirest.Domain.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Person {


    // ESTE ES UN ID NO AUTO-INCREMENTAL

    @Id 
    @Column(name = "id_person" , columnDefinition = "VARCHAR(20)" , nullable = false)
    private String idPerson; 

    @Column(name = "firts_name" , columnDefinition = "VARCHAR(50)" , nullable = false)
    private String firtsName;

    @Column(name = "last_name" , columnDefinition = "VARCHAR(50)" , nullable = false)
    private String lastName;


    // ACA ENBEBO LA CLASE AUDIT
    @Embedded 
    private Audit audit;

    @ManyToOne
    City cities;

    // muchos tipos de persona pueden estar en persona pero persona solo puede tener un tipo de persona
    @ManyToOne
    TypePerson typePersons;




    public Person() {
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public TypePerson getTypePersons() {
        return typePersons;
    }

    public void setTypePersons(TypePerson typePersons) {
        this.typePersons = typePersons;
    }

    

}
