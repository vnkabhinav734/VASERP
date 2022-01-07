package com.example.Sales.Sales.service;

import com.example.Sales.Sales.model.SaleItem;
import com.example.Sales.Sales.repository.SaleItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleItemServiceImpl implements SaleItemService{

    private SaleItemRepository saleItemRepository;

    @Autowired
    public SaleItemServiceImpl(SaleItemRepository saleItemRepository) {
        this.saleItemRepository = saleItemRepository;
    }

    @Override
    public SaleItem saveSaleItem(SaleItem saleItem) {
        saleItemRepository.save(saleItem);
        return saleItem;
    }

    @Override
    public List<SaleItem> getSaleItems() {
        return (List<SaleItem>)saleItemRepository.findAll();
    }
}
