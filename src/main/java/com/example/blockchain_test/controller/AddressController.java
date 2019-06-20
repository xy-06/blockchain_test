package com.example.blockchain_test.controller;


import com.example.blockchain_test.dao.TransacationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private TransacationMapper transacationMapper;

    @GetMapping("/getBalance")
    public Double getBalance(@RequestParam String address){
        Double balance = transacationMapper.getBalance(address);
        return balance;
    }
}
