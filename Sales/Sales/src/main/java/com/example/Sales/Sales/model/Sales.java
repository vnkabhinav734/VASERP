package com.example.Sales.Sales.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Sales")
public class Sales {


    public int salesId;
    @Id
    public int salesNo;
    @JsonFormat(pattern="yyyy-MM-dd")
    public Date saleDate;
    public int total;

    public Sales() {
    }

    public Sales(int salesId, int salesNo, Date saleDate, int total) {
        this.salesId = salesId;
        this.salesNo = salesNo;
        this.saleDate = saleDate;
        this.total = total;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
