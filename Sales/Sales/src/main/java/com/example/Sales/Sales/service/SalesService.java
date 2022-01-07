package com.example.Sales.Sales.service;

import com.example.Sales.Sales.model.Sales;

import java.util.List;

public interface SalesService {

    Sales saveSales(Sales sales);
    List<Sales> getSales();

}
