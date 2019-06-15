package com.example.blockchain_test.dao;

import com.example.blockchain_test.po.TxDetall;

public interface TxDetallMapper {
    int deleteByPrimaryKey(Long txid);

    int insert(TxDetall record);

    int insertSelective(TxDetall record);

    TxDetall selectByPrimaryKey(Long txid);

    int updateByPrimaryKeySelective(TxDetall record);

    int updateByPrimaryKey(TxDetall record);
}