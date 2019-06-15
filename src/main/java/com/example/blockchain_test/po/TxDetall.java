package com.example.blockchain_test.po;

public class TxDetall {
    private Long txid;

    private String adress;

    private Double amount;

    private String isremove;

    private String hash;

    public Long getTxid() {
        return txid;
    }

    public void setTxid(Long txid) {
        this.txid = txid;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getIsremove() {
        return isremove;
    }

    public void setIsremove(String isremove) {
        this.isremove = isremove == null ? null : isremove.trim();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }
}