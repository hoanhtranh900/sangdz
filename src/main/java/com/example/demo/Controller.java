package com.example.demo;

import com.example.demo.repository.Bai1Repository;
import com.example.demo.repository.Bai2Repository;
import com.example.demo.repository.Bai3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Bai1Repository bai1Repository;
    @Autowired
    private Bai2Repository bai2Repository;

    @Autowired
    private Bai3Repository bai3Repository;

    @PostMapping("/bai1")
    public ResponseEntity<?> bai1(@RequestBody Bai1 bai1) {
        List<Bai1> bai11 = bai1Repository.findBy1And2( "%"+bai1.getName() + "%", "%"+bai1.getNumber() + "%");

        return new ResponseEntity<>(bai11, HttpStatus.OK);

    }

    @PostMapping("/bai2")
    public ResponseEntity<?> bai2(@RequestBody Bai2 bai2) {
        List<Bai2> bai12 = bai2Repository.findBy1And2(bai2.getOrderNumber(), bai2.getCompanyId());

        return new ResponseEntity<>(bai12, HttpStatus.OK);

    }

    @PostMapping("/bai3")
    public ResponseEntity<?> bai2(@RequestBody Bai3 bai3) {
        List<Bai3> listbai3 = bai3Repository.findBy1And2(bai3.getProductCode(), bai3.getQuantity());

        return new ResponseEntity<>(listbai3, HttpStatus.OK);

    }
}
