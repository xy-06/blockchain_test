package com.example.blockchain_test.po;

import java.util.Date;

public class Transacation {
    private String txhash;

    private Date time;

    private Integer size;

    private Float weight;

    private Double totalOutput;

    private Double totalInput;

    private Double fee;

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash == null ? null : txhash.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Double getTotalOutput() {
        return totalOutput;
    }

    public void setTotalOutput(Double totalOutput) {
        this.totalOutput = totalOutput;
    }

    public Double getTotalInput() {
        return totalInput;
    }

    public void setTotalInput(Double totalInput) {
        this.totalInput = totalInput;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}