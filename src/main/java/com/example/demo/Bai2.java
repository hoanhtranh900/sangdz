package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "BAI2")
public class Bai2 {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //mã đơn hàng - ordernumber
    @Column(name = "ORDER_NUMBER")
    private String orderNumber;
    @Column(name = "COMPANY_ID")
    private String companyId;
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


}