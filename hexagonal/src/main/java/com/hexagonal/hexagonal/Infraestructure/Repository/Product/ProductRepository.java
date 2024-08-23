package com.hexagonal.hexagonal.Infraestructure.Repository.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.hexagonal.Domain.Entities.Product;


public interface ProductRepository extends JpaRepository<Product , Long> {
    

}
