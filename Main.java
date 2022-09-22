package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bingo bingo = new Bingo();
        System.out.println(bingo.getAnswer());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int givenNumber = scanner.nextInt();
            if (givenNumber > bingo.getAnswer()) {
                System.out.println("Too much");
            } else if (givenNumber < bingo.getAnswer()) {
                System.out.println("Not enough");
            } else {
                System.out.println("Bingo!");
                break;
            }
        }
    }
}
