package com.example.blockchain_test.api;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface BlockApi {

    @GetMapping("/rest/block.json")
    JSONObject getBlock();

    @GetMapping("/rest/tx{txhash}.json")
    JSONObject getTransaction(@PathVariable("txhash") String txhash);

    @GetMapping("/rest/tx{txhash}.json")
    JSONObject getTxDetall(@PathVariable("txhash") String txhash);




}
