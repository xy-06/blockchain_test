package com.example.blockchain_test.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.blockchain_test.api.BitcoinJsonRpcApi;
import com.example.blockchain_test.dao.BlockMapper;
import com.example.blockchain_test.dao.TransacationMapper;
import com.example.blockchain_test.dto.TransacationDto;
import com.example.blockchain_test.dto.TransactionDetail;
import com.example.blockchain_test.po.Block;
import com.example.blockchain_test.po.Transacation;
import com.example.blockchain_test.po.TxDetall;
import com.example.blockchain_test.service.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.LinkedHashMap;

@Service
public class BitcoinServiceImpl implements BitcoinService {


    @Autowired
    private BlockMapper blockMapper;

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;


    @Autowired
    private TransacationMapper transacationMapper;

    @Override
    public void syncBlock(String blockhsah) throws Throwable {
        String tempBlockhash = blockhsah;
        while(tempBlockhash !=null && !tempBlockhash.isEmpty()){
            JSONObject blockJson = bitcoinJsonRpcApi.getBlockByHash(tempBlockhash);
            Block block = new Block();
            block.setBlockhash(blockJson.getString("hash"));
            block.setHeight(blockJson.getInteger("height"));
            block.setDifficulty(blockJson.getDouble("difficulty"));
            block.setMerkleroot(blockJson.getString("merkleroot"));
            block.setNextblockhash(blockJson.getString("nextblockhash"));
            block.setPrevblockhash(blockJson.getString("previousblockhash"));
            block.setOutputTotal(blockJson.getString("outputTotal"));
            block.setTxsize(blockJson.getShort("size"));
            block.setWeight(blockJson.getFloat("weight"));
            Long time = blockJson.getLong("time");
            blockMapper.insert(block);
        }
    }

    @Override
    @Transactional
    public void syncTx(JSONObject txJson, String blockHash, Date time, Integer confirmations) {
        Transacation transacation = new Transacation();
        transacation.setTxhash(txJson.getString("txid"));
        transacation.setTime(time);
        transacation.setSize(txJson.getInteger("size"));
        transacation.setWeight(txJson.getFloat("weight"));
        transacationMapper.insertSelective(transacation);
        syncTxDetail(txJson);
    }

    @Override
    @Transactional
    public void syncTxDetail(JSONObject txjson) {
        JSONArray vout = txjson.getJSONArray("vout");
        syncDetailvout(vout);
        JSONArray vin = txjson.getJSONArray("vin");
        syncDetailvin(vin);
    }

    @Override
    public void syncDetailvout(JSONArray vouts) {

    }

    @Override
    public void syncDetailvin(JSONArray vins) {
        for (Object vout : vins) {
            JSONObject jsonObject = new JSONObject((LinkedHashMap) vout);
        }
    }

    @Override
    public void syncTxDetailvin(JSONArray vins, String txid) throws Throwable {
        for (Object vinObj : vins) {
            JSONObject jsonObject = new JSONObject((LinkedHashMap) vinObj);
            String vinTxid = jsonObject.getString("txid");
            Integer n = jsonObject.getInteger("vout");
            JSONObject vinTxJson = bitcoinJsonRpcApi.getTransactionByID(vinTxid);
            JSONArray vouts = vinTxJson.getJSONArray("vout");
            JSONObject utxoJson = vouts.getJSONObject(n);

            TransactionDetail txDetail = new TransactionDetail();
            txDetail.setAmount(utxoJson.getDouble("value"));
            txDetail.setTxhash(txid);
            JSONObject scriptPubKey = jsonObject.getJSONObject("scriptPubKey");
            JSONArray addresses = scriptPubKey.getJSONArray("address");
            if(addresses!=null){
                String address = addresses.getString(0);
                txDetail.setAddress(address);
            }
            transacationMapper.insert(txDetail);
        }
    }


}
