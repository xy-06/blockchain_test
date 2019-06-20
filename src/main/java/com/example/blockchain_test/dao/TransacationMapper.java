package com.example.blockchain_test.dao;

import com.example.blockchain_test.dto.TransactionDetail;
import com.example.blockchain_test.po.Transacation;
import org.apache.ibatis.annotations.Param;

public interface TransacationMapper {
    int deleteByPrimaryKey(String txhash);

    int insert(TransactionDetail record);

    int insertSelective(Transacation record);

    Transacation selectByPrimaryKey(String txhash);

    int updateByPrimaryKeySelective(Transacation record);

    int updateByPrimaryKey(Transacation record);

    Double getBalance(@Param("address") String address);
}