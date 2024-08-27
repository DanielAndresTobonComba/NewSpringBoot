package com.hexagonal.hexagonal_app.infrastructure.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.hexagonal_app.application.service.product.IProductservice;
import com.hexagonal.hexagonal_app.domain.entities.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private IProductservice productservice;
    
    @GetMapping
    public List<Product> list(){
        return productservice.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> show(@PathVariable Long id){
        return productservice.findById(id);
    }

}
