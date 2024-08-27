package com.hexagonal.hexagonal_app.application.service.product;

import java.util.List;
import java.util.Optional;

import com.hexagonal.hexagonal_app.domain.entities.Product;

public interface IProductservice {
    Optional<Product> findById(Long id);
    List<Product> getAll();
    Product save(Product product);
}
