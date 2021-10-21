// block diagram - https://docs.google.com/drawings/d/1MlZn5V7VkfcvARPDDRArOjDhSw6Pv2_4tn2NYtWfMTU/edit

package com.pb.kopiton.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        System.out.println("Start Game");

        int random = (int) (Math.random()*100);
        int number;
        int counter = 0;

        do {
            counter ++;

            Scanner end = new Scanner(System.in);
            System.out.println("Хотите продолжить? Если да, укажите  Y : ");
            String go = end.next();

            if (go.equals ("Y") || go.equals("y")) {

                Scanner num = new Scanner(System.in);
                System.out.println("Попытка " + counter + " Угадай число от 0 до 100: ");
                number = num.nextInt();

                if (number == random) {
                    System.out.println("Вы угадали с " + counter + " попытки :)");
                } else {
                    System.out.println("Вы не угадали :(");
                    //System.out.println("Загаданное число " + random);
                    if (random > number) {
                        System.out.println("Загаданное число > чем " + number);
                    }
                    if (random < number) {
                        System.out.println("Загаданое число < чем " + number);
                    }

                }

            }
            else {
                break;
            }

        }
        while (random != number);
        System.out.println ("Game Over");

    }

}