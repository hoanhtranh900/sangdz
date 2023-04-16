package com.example.demo;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "BAI1")
public class Bai1 {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //tên chủ thẻ
    @Column(name = "NAME")
    private String name;

    //Kiểu thẻ
    @Column(name = "TYPE")
    private String type;

    //số thẻ
    @Column(name = "NUMBER")
    private String number;

    //cvv
    @Column(name = "CVV")
    private String cvv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
