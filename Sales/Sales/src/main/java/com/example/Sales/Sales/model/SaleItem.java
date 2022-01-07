package com.example.Sales.Sales.model;

import javax.persistence.*;

@Entity
@Table(name="SaleItem")
public class SaleItem {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public int salesId;

    public int productId;

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int Qty;
    public int salesPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
