package com.example.Sales.Sales.service;

import com.example.Sales.Sales.model.Sales;
import com.example.Sales.Sales.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public SalesServiceImpl(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }


    @Override
    public Sales saveSales(Sales sales) {
        salesRepository.save(sales);
        return sales;
    }

    @Override
    public List<Sales> getSales() {
        return (List<Sales>)salesRepository.findAll();
    }
}
