package com.example.blockchain_test.dao;

import com.example.blockchain_test.po.Transacation;

public interface TransacationMapper {
    int deleteByPrimaryKey(String txhash);

    int insert(Transacation record);

    int insertSelective(Transacation record);

    Transacation selectByPrimaryKey(String txhash);

    int updateByPrimaryKeySelective(Transacation record);

    int updateByPrimaryKey(Transacation record);
}