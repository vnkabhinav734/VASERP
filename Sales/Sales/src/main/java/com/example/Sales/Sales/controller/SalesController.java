package com.example.Sales.Sales.controller;

import com.example.Sales.Sales.model.Sales;
import com.example.Sales.Sales.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1")
@RestController
public class SalesController {

    @Autowired
    public SalesService salesService;

    @PostMapping("/insertSales")
    public ResponseEntity<Sales> saveSales(@RequestBody Sales sales){
        return new ResponseEntity<Sales>(salesService.saveSales(sales), HttpStatus.CREATED);
    }

    @GetMapping("/viewSales")
    public ResponseEntity<List<Sales>> getProducts(){
        List <Sales> salesList= salesService.getSales();
        return new ResponseEntity<List<Sales>>(salesList,HttpStatus.FOUND);
    }

}
