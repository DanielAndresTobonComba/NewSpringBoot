package com.hexagonal.hexagonal.Application.Service.Product;

import java.util.List;
import java.util.Optional;

import com.hexagonal.hexagonal.Domain.Entities.Product;

public interface IProductService {

    Optional<Product> findById(Long id); 
    List<Product> getAll();
    Product save(Product product);
}
