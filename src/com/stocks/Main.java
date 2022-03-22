package com.stocks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Stock Maintenance Program");
        StockPortfolio value = new StockPortfolio();
        value.stockValue();
        int i = 0;
        while (i < 1) {
            System.out.println("Press 1 to create another account/Press 0 to exit");
            Scanner in = new Scanner(System.in);
            if (in.nextInt() == 1) {
                value.updateA();
            } else if (in.nextInt() == 0) {
                System.out.println("Thank You");
                i = 1;
            }
        }
    }
}