package com.larry.testspringpostgres.controller;

import com.larry.testspringpostgres.entity.UserControl;
import com.larry.testspringpostgres.repository.UserControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserControlController {

    @Autowired
    private UserControlRepository userControlRepository;

    @RequestMapping("/user")
    public ResponseEntity<List<UserControl>> getUserAllControl(){
        return ResponseEntity.ok(userControlRepository.findAll());
    }
}
