package com.hexagonal.hexagonal.Infraestructure.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.hexagonal.Application.Service.Product.IProductService;
import com.hexagonal.hexagonal.Domain.Entities.Product;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private IProductService service; 

    @GetMapping
    public List<Product> list () {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> show(@PathVariable Long id) {
        return service.findById(id);
    }

}
