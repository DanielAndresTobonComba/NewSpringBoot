package com.apirest.apirest.Domain.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

    // name se usa para cambiar el nombre del campo en la base de datos (name = "nombre")

    @Id 
    @Column(columnDefinition = "VARCHAR(5)" , nullable = false)
    private String codecountry; 

    @Column(columnDefinition = "VARCHAR(50)" , nullable = false)
    private String namecountry;

    // RELACION BI-DIRECCIONAL NO ES NECESARIO SOLO CON LA RELACION DE LA HIJA SIRVE
    @OneToMany(mappedBy = "countries") // NOMBRE DEL ATRIBUTO EN LA HIJA
    private List<Region> regions;

    public Country() {
    }

    public String getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }


    

}
