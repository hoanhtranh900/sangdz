package com.example.demo.repository;

import com.example.demo.Bai2;
import com.example.demo.Bai3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Bai3Repository extends JpaRepository<Bai3, Long> {

    //find productCode and quantity > quantity
    @Query("SELECT b FROM Bai3 b WHERE b.productCode like ?1 AND b.quantity > ?2")
    List<Bai3> findBy1And2(String productCode, Long quantity);
}
