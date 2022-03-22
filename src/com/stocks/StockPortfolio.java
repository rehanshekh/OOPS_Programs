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

    public void updateC() {
        int j = 0;
        while (j < 3) {
            System.out.println("Enter the name of Account to be updated");
            String accountName = in.next();
            if (map.containsKey(accountName)) {
                for (Stock info : map.get(accountName)) {
                    int i = 0;
                    while (i < 3) {
                        System.out.println("Enter the name of share to be updated");
                        String name = in.next();
                        if (Objects.equals(info.getShareName(), name)) {
                            System.out.println("Stock Name:" + info.getShareName() + "  Number of Shares:" + info.getNoOfShare() + "  Share Price:" + info.getSharePrice() + "  Stock Value:" + info.getNoOfShare() * info.getSharePrice());
                            System.out.println("Press 1 to add or remove Number of Shares/Press 2 to update Share Price");
                            int choice = in.nextInt();
                            if (choice == 1) {
                                System.out.println("Enter the updated quantity of Shares");
                                int shares = in.nextInt();
                                info.setNoOfShare(shares);
                                i = 3;
                            } else if (choice == 2) {
                                System.out.println("Enter the updated price of Each Share");
                                int sharePrice = in.nextInt();
                                info.setSharePrice(sharePrice);
                                i=3;
                            }
                        } else if (!info.getShareName().equals(name)) {
                            System.out.println("No such share in the account, please enter again");
                            i++;
                        }
                    }
                }
                display();
                j = 3;
            } else {
                System.out.println("No such account, please re-enter the Account Name");
                j++;
            }
        }
    }
}