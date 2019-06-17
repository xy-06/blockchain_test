package com.example.blockchain_test.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface BitcoinJsonRpcApi {

    JSONObject getBlockchainInfo() throws Throwable;

    JSONObject getBlockByHash(String blockhash) throws Throwable;

    JSONObject getTransactionByID(String txid) throws  Throwable;

    String getBlockhashByHeight(Integer height) throws Throwable;

    JSONArray getHeaders(Integer count,String blockhash) throws  Throwable;

    JSONObject getNotxdetails(String blockhash) throws  Throwable;

    JSONObject getMempoolInfo() throws  Throwable;

    JSONObject getMempoolContents() throws  Throwable;


}
