package com.example.blockchain_test.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.blockchain_test.api.BitcoinJsonRpcApi;
import com.example.blockchain_test.dao.BlockMapper;
import com.example.blockchain_test.po.Block;
import com.example.blockchain_test.service.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@Component
public class TempController {

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @Autowired
    private BitcoinService bitcoinService;

    @PostMapping("/test")
    public String test() throws Throwable{
        String tempBlockhash = "0000000000074b2c78f8dca78f2501bee52e5413e7639c5e74af540881b15869";
        bitcoinService.syncBlock(tempBlockhash);
        return null;
    }


}
