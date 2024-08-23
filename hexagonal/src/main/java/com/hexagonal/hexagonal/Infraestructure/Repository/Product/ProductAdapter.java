package com.hexagonal.hexagonal.Infraestructure.Repository.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonal.hexagonal.Application.Service.Product.IProductService;
import com.hexagonal.hexagonal.Domain.Entities.Product;

@Service
public class ProductAdapter implements IProductService {

    @Autowired
    private ProductRepository producRepository;


    @Override
    public Optional<Product> findById(Long id) {
       return producRepository.findById(id);
    }

    @Override
    public List<Product> getAll() {

        return producRepository.findAll();
    }

    @Override
    public Product save(Product product) {

        return producRepository.save(product);
    }

}
