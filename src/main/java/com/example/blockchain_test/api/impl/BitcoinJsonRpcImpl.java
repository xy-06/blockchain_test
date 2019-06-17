package com.example.blockchain_test.api.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.blockchain_test.api.BitcoinJsonRpcApi;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;

@Component
public class BitcoinJsonRpcImpl implements BitcoinJsonRpcApi{

    private JsonRpcHttpClient jsonRpcHttpClient;

    public BitcoinJsonRpcImpl(@Value("${bitcoin.jsonrpc.username}") String username,
                                 @Value("${bitcoin.jsonrpc.password}") String password,
                                 @Value("${bitcoin.jsonrpc.url}") String url) throws MalformedURLException {
        HashMap<String, String> headers = new HashMap<>();
        String authStrOrig = String.format("%s:%s",username,password);
        String authStr = Base64.getEncoder().encodeToString(authStrOrig.getBytes());
        String authStrResult = String.format("Basic %s",authStr);
        headers.put("Authorization",authStrResult);
        jsonRpcHttpClient = new JsonRpcHttpClient(new URL(url),headers);
    }



    @Override
    public JSONObject getBlockchainInfo() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getblockchaininfo", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getBlockByHash(String blockhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getBlockByHash", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getTransactionByID(String txid) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getTransactionByID", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public String getBlockhashByHeight(Integer height) throws Throwable {
        String result = jsonRpcHttpClient.invoke("getBlockhashByHeight", new Object[]{height}, String.class);
        return result;
    }

    @Override
    public JSONArray getHeaders(Integer count, String blockhash) throws Throwable {
        JSONArray jsonObject = jsonRpcHttpClient.invoke("getHeaders", new Object[]{}, JSONArray.class);
        return jsonObject;
    }

    @Override
    public JSONObject getNotxdetails(String blockhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getNotxdetails", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getMempoolInfo() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getMempoolInfo", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getMempoolContents() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getMempoolContents", new Object[]{}, JSONObject.class);
        return jsonObject;
    }
}
