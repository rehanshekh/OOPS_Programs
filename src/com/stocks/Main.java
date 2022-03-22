package com.stocks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Stock Maintenance Program");
        StockPortfolio value = new StockPortfolio();
        value.stockValue();
        int i = 0;
        while (i < 1) {
            System.out.println("Press 1 to create another Stock Account/Press 2 to Add Shares in an existing Account/Press 0 to exit");
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()) {
                case 0 -> {
                    System.out.println("Thank You");
                    i = 1;
                }
                case 1 -> value.updateA();
                case 2 -> value.updateC();
                default -> System.out.println("Invalid Input");
            }
        }
        System.out.println();
    }
}