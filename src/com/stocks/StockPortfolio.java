package com.stocks;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio{
    public static float total = 0;
    public void stockValue(){
    System.out.println("Enter No. of Stocks");
    Scanner in = new Scanner(System.in);
    int quantity =in.nextInt();
    ArrayList<Stock> list = new ArrayList<>();
        for (int i=1; i<=quantity; i++){
        System.out.println("Enter the "+i+" share name");
        String shareName = in.next();
        System.out.println("Enter the no. of shares");
        int noOfShare = in.nextInt();
        System.out.println("Enter share price of each stock");
        float sharePrice = in.nextFloat();
        Stock stock = new Stock(shareName,noOfShare,sharePrice);
        list.add(stock);
    }for (Stock info:list){
        System.out.println("Stock Name:"+info.getShareName()+"  Number of Shares:"+info.getNoOfShare()+"  Share Price:"+info.getSharePrice()+"  Stock Value:"+info.getNoOfShare()*info.getSharePrice());
        total =total + (info.getNoOfShare()*info.getSharePrice());
    }
        System.out.println("The total value of all stocks is "+total);
}
}
