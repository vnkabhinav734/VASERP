package com.example.VasERP.ProductMicroService.repository;

import com.example.VasERP.ProductMicroService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
