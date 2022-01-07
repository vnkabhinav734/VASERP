package com.example.Sales.Sales.service;

import com.example.Sales.Sales.model.SaleItem;
import com.example.Sales.Sales.model.Sales;

import java.util.List;

public interface SaleItemService {

    SaleItem saveSaleItem(SaleItem saleItem);
    List<SaleItem> getSaleItems();
}
