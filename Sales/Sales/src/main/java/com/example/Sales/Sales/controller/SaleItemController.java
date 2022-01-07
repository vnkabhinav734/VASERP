package com.example.Sales.Sales.controller;

import com.example.Sales.Sales.model.SaleItem;
import com.example.Sales.Sales.model.Sales;
import com.example.Sales.Sales.service.SaleItemService;
import com.example.Sales.Sales.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1")
@RestController
public class SaleItemController {

    @Autowired
    public SaleItemService saleItemService;

    @PostMapping("/insertSaleItem")
    public ResponseEntity<SaleItem> saveSaleItem(@RequestBody SaleItem saleItem){
        return new ResponseEntity<SaleItem>(saleItemService.saveSaleItem(saleItem), HttpStatus.CREATED);
    }

    @GetMapping("/viewSaleItem")
    public ResponseEntity<List<SaleItem>> getSaleItems(){
        List <SaleItem> saleItemList= saleItemService.getSaleItems();
        return new ResponseEntity<List<SaleItem>>(saleItemList,HttpStatus.FOUND);
    }
}
