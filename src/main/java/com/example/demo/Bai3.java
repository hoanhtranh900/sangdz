package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "BAI3")
public class Bai3 {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //mã sản phẩm
    @Column(name = "PRODUCT_CODE")
    private String productCode;

    //số lượng
    @Column(name = "QUANTITY")
    private Long quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
