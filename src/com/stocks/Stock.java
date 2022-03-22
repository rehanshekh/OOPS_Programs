package com.stocks;

public class Stock {
    String shareName;
    int noOfShare;
    float sharePrice;

    public Stock(String shareName, int noOfShare, float sharePrice) {
        this.shareName = shareName;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public float getSharePrice() {
        return sharePrice;
    }
}
