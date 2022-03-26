package com.cards;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static Scanner in = new Scanner(System.in);
    int noOfPlayers;
    int noOfCards;
    Player[] player;
    String[][] deck;

    public Game(int noOfPlayers, int noOfCards, String[][] deck) {
        this.noOfPlayers = noOfPlayers;
        this.noOfCards = noOfCards;
        this.deck = deck;
        initPlayer();
    }

    public void initPlayer() {
        player = new Player[4];
        for (int i = 0; i < player.length; i++) {
            System.out.println("Please Enter the " + i + " player name");
            String name = in.next();
            player[i] = new Player(name, 9);
        }
    }

    public void playGame() {
        for (int i = 0; i < noOfCards; i++) {
            for (Player value : player) {
                int randomNumber1 = (int) (Math.random() * 3);
                int randomNumber2 = (int) (Math.random() * 12);
                System.out.println(randomNumber1 + "  " + randomNumber2);
                value.cards[i] = deck[randomNumber1][randomNumber2];
                while (deck[randomNumber1][randomNumber2]
                        .equals("null")) {
                    randomNumber1 = (int) (Math.random() * 3);
                    randomNumber2 = (int) (Math.random() * 12);
                    value.cards[i] = deck[randomNumber1][randomNumber2];
                }
                deck[randomNumber1][randomNumber2] = "null";
            }
        }

    }

    public void print() {
        for (Player value : player) {
            value.sort();
            System.out.println(value.getName() + " " + Arrays.toString(value.getCards()));
        }
    }
}
