package com.example.VasERP.ProductMicroService.model;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int productId;
    public String productName;
    public String productPrice;

    public Product() {
    }

    public Product(int productId, String productName, String productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
