package com.apirest.apirest.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

    @Id 
    @Column(columnDefinition = "VARCHAR(5)" , nullable = false)
    private String codecity; 

    @Column(columnDefinition = "VARCHAR(50)" , nullable = false)
    private String namecity;


    @ManyToOne
    @JoinColumn(name = "coderegion_id") 
    private Region regions;


    public City() {
    }

    public String getCodecity() {
        return codecity;
    }

    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    

}
