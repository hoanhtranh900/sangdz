package com.example.demo.repository;

import com.example.demo.Bai1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Bai1Repository extends JpaRepository<Bai1, Long> {
    @Query("SELECT b FROM Bai1 b WHERE 1=1  " +
            " and ( b.name like ?1) " +
            " and ( b.number like ?2) "
    )
    List<Bai1> findBy1And2(String name, String number);
}
