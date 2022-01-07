package com.example.VasERP.ProductMicroService.service;

import com.example.VasERP.ProductMicroService.model.Product;
import com.example.VasERP.ProductMicroService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product saveProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> getProducts() {
        return (List<Product>)productRepository.findAll();
    }
}
