package com.example.Sales.Sales.repository;

import com.example.Sales.Sales.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales,Integer> {
}
