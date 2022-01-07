package com.example.VasERP.ProductMicroService.service;

import com.example.VasERP.ProductMicroService.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getProducts();
}
