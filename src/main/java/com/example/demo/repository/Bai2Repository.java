package com.example.demo.repository;

import com.example.demo.Bai2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bai2Repository extends JpaRepository<Bai2, Long> {

    @Query("SELECT b FROM Bai2 b WHERE b.orderNumber like ?1 AND b.companyId like ?2")
    List<Bai2> findBy1And2(String orderNumber, String companyId);
}
