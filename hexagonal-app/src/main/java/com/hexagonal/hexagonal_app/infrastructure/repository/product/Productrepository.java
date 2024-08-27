package com.hexagonal.hexagonal_app.infrastructure.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.hexagonal_app.domain.entities.Product;

public interface Productrepository extends JpaRepository<Product,Long> {

} 