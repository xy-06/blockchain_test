package com.example.blockchain_test.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.blockchain_test.api.BlockApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/block")
public class BitcoinController {

    @Autowired
    private BlockApi blockApi;

    @GetMapping("/getBlock")
    public String getBlock(){
        JSONObject block = blockApi.chaininfo();
        return block.toJSONString();

    }

    @GetMapping("/getTransaction")
    public String getTransaction(){
        JSONObject jsonObject = blockApi.getTransaction("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        return jsonObject.toJSONString();

    }

    @GetMapping("/block")
    public String block(){
        JSONObject jsonObject = blockApi.block("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        return jsonObject.toJSONString();
    }

    @GetMapping("/headers")
    public String headers(){
        JSONObject jsonObject = blockApi.headers(1543870);
        return jsonObject.toJSONString();
    }

    @GetMapping("/blockhashbyheight")
    public String blockhashbyheight(){
        JSONObject jsonObject = blockApi.blockhashbyheight(10);
        return jsonObject.toJSONString();
    }

    @GetMapping("/chaininfo")
    public String chaininfo(){
        JSONObject jsonObject = blockApi.chaininfo();
        return jsonObject.toJSONString();
    }

    @GetMapping("/getutxos")
    public String getutxos(){
        JSONObject jsonObject = blockApi.getutxos("00000000000000000000000000000000000000000000011b4f210a9144b96451");
        return jsonObject.toJSONString();
    }

    @GetMapping("/mempool")
    public String mempool(){
        JSONObject jsonObject = blockApi.mempool();
        return jsonObject.toJSONString();
    }





}
