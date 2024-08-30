package com.apirest.apirest.Domain.Entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


// ESTO ES PARA INCRUTAR ESTA CLASE EN OTRA ESTARA EMBEBIDA DONDE CUYODS ATRIBUTOS SE PEUDEN ALMACENAR EN OTRA TABLA 

// SE USA EMBEDDABLE Y EL IMPLEMENTS SEREIALIZABLE 

// Este se tambien se le pueden implementar atributos propios de la relacion
@Embeddable
public class ProductInvoicePk implements Serializable {

    @Column(name = "id_product")
    private Long idProduct; 

    @Column(name = "id_invoice")
    private Long idInvoice;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
    }


    

}
