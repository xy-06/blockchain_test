package com.example.blockchain_test.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public interface BitcoinService {
    void syncBlock(String blockhsah) throws Throwable;

    void syncTx(JSONObject txJson, String blockHash, Date time, Integer confirmations);

    void syncTxDetail(JSONObject txjson);

    void syncDetailvout(JSONArray vouts);

    void syncDetailvin(JSONArray vins);

    void syncTxDetailvin(JSONArray vins,String txid) throws Throwable;

}
