package com.di.app.app_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.app.app_di.models.Product;
import com.di.app.app_di.repositories.ProductRepository;

// LOS SERVICES CONTIENE LA LOGICA DE NEGOCIO Y LA SEPARAN DE LOS COTNROLADORES Y LA CAPA DE ACCESO DE DATOS 
@Service
public class ProductServiceImpl implements ProductService {


    // CREAMOS LA INYECCION DE DEPENDENCIA DEL REPOSITORIO

    // @Autowired
    // private ProductRepository repositoryProduct;

    // Hacer una injeccion de dependencias por medio de un setter 
    private ProductRepository repositoryProduct;

    @Autowired
    public void setRepositoryProduct(ProductRepository repositoryProduct) {
    this.repositoryProduct = repositoryProduct;
    }

    public List<Product> findAll(){

        // OBTENEMOS LOS PRODUCTOS DEL METODO FIND ALL QUE ESTA EN LA DEPEDENCIA

        return repositoryProduct.findAll().stream().map(p ->{

            // TOMAMOS CADA PRODUCTO QUE NOS RETORNO EL METODO Y SE LE HACE LA MODIFICACION

            Double priceTax = p.getPrice() * 1.45d;
            // Product newProduct = new Product(p.getId(), p.getName(), priceTax.longValue());
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            // newProduct.setPrice(priceTax.longValue());
            return newProduct;

        }).collect(Collectors.toList());
    }


    // LLAMAMOS AL METODO QUE TIENE ESA DEPENCIA QUE SE INYECTO
    public Product findById(Long id){
        return repositoryProduct.findById(id);        
    }
}
