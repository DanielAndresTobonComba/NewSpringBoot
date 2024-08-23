package com.hexagonal.hexagonal.Domain.Entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String name; 
    private double price; 
    private int stock; 
    private int stockmin; 
    private int stockmax;
    
    public Product() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStockmin() {
        return stockmin;
    }
    public void setStockmin(int stockmin) {
        this.stockmin = stockmin;
    }
    public int getStockmax() {
        return stockmax;
    }
    public void setStockmax(int stockmax) {
        this.stockmax = stockmax;
    } 
    
    


}
