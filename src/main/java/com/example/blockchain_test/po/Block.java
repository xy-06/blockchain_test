package com.example.blockchain_test.po;

import java.util.Date;

public class Block {
    private String blockhash;

    private Integer height;

    private Date time;

    private Short txsize;

    private Double difficulty;

    private Float weight;

    private String merkleroot;

    private String outputTotal;

    private String nextblockhash;

    private String prevblockhash;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash == null ? null : blockhash.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Short getTxsize() {
        return txsize;
    }

    public void setTxsize(Short txsize) {
        this.txsize = txsize;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot == null ? null : merkleroot.trim();
    }

    public String getOutputTotal() {
        return outputTotal;
    }

    public void setOutputTotal(String outputTotal) {
        this.outputTotal = outputTotal == null ? null : outputTotal.trim();
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash == null ? null : nextblockhash.trim();
    }

    public String getPrevblockhash() {
        return prevblockhash;
    }

    public void setPrevblockhash(String prevblockhash) {
        this.prevblockhash = prevblockhash == null ? null : prevblockhash.trim();
    }
}