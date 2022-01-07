package com.example.VasERP.ProductMicroService.controller;

import com.example.VasERP.ProductMicroService.model.Product;
import com.example.VasERP.ProductMicroService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1")
@RestController
public class ProductController {

    @Autowired
    public ProductService productService;

    @PostMapping("/insertProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/viewProduct")
    public ResponseEntity<List<Product>> getProducts(){
        List <Product> productList= productService.getProducts();
        return new ResponseEntity<List<Product>>(productList,HttpStatus.FOUND);
    }
}
