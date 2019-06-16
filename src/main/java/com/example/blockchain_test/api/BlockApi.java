package com.example.blockchain_test.api;


import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="blockchain",url = "http://localhost:18332")
public interface BlockApi {

    @GetMapping("/rest/chaininfo.json")
    JSONObject chaininfo();

    @GetMapping("/rest/tx{txhash}.json")
    JSONObject getTransaction(@PathVariable("txhash") String txhash);

    @GetMapping("/rest/headers{count}.json")
    JSONObject headers(@PathVariable("count") Integer count);

    @GetMapping("/rest/notxdetails{blockhash}.json")
    JSONObject notxdetails(@PathVariable("blockhash") String blockhash);

    @GetMapping("/rest/block{blockhash}.json")
    JSONObject block(@PathVariable("blockhash") String blockhash);

    @GetMapping("/rest/blockhashbyheight{height}.json")
    JSONObject blockhashbyheight(@PathVariable("height") double height);

    @GetMapping("/rest/getutxos{checkmempool}.json")
    JSONObject getutxos(@PathVariable("checkmempool") String checkmempool);

    @GetMapping("/rest/mempool/info.json")
    JSONObject mempool();



}
