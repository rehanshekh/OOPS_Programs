package com.stocks;

import java.util.*;

public class StockPortfolio {
    public static float total = 0;
    Map<String, List<Stock>> map = new LinkedHashMap<>();
    Scanner in = new Scanner(System.in);

    public void stockValue() {

        System.out.println("How many accounts do you want to create");
        int accounts = in.nextInt();
        for (int a = 1; a <= accounts; a++) {
            System.out.println("Create an account by Name");
            String accountName = in.next();
            map.put(accountName, new LinkedList<>());
            System.out.println("Enter No. of Stocks");
            int quantity = in.nextInt();
            for (int i = 1; i <= quantity; i++) {
                System.out.println("Enter the " + i + " share name");
                String shareName = in.next();
                System.out.println("Enter the no. of shares");
                int noOfShare = in.nextInt();
                System.out.println("Enter share price of each stock");
                float sharePrice = in.nextFloat();
                Stock stock = new Stock(shareName, noOfShare, sharePrice);
                map.get(accountName).add(stock);
            }
        }
        display();
    }

    public void display() {
        for (String key : map.keySet()) {
            System.out.println("Account Name:" + key);
            total = 0;
            for (Stock info : map.get(key)) {
                System.out.println("Stock Name:" + info.getShareName() + "  Number of Shares:" + info.getNoOfShare() + "  Share Price:" + info.getSharePrice() + "  Stock Value:" + info.getNoOfShare() * info.getSharePrice());
                total = total + (info.getNoOfShare() * info.getSharePrice());
            }
            System.out.println("The total value of all stocks is " + total);
        }
    }

    public void updateA() {
        System.out.println("How many accounts do you want to create");
        int accounts = in.nextInt();
        for (int a = 1; a <= accounts; a++) {
            int r = 1;
            while (r > 0) {
                System.out.println("Create an account by Name");
                String accountName = in.next();
                boolean key = map.containsKey(accountName);
                if (!key) {
                    map.put(accountName, new LinkedList<>());
                    System.out.println("Enter No. of Stocks");
                    int quantity = in.nextInt();
                    for (int i = 1; i <= quantity; i++) {
                        System.out.println("Enter the " + i + " share name");
                        String shareName = in.next();
                        System.out.println("Enter the no. of shares");
                        int noOfShare = in.nextInt();
                        System.out.println("Enter share price of each stock");
                        float sharePrice = in.nextFloat();
                        Stock stock = new Stock(shareName, noOfShare, sharePrice);
                        map.get(accountName).add(stock);
                    }
                    display();
                    r = 0;
                } else {
                    System.out.println("Account Exists, please enter another Account Name");
                }
            }
        }
    }
}