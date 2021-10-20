// block diagram - https://docs.google.com/drawings/d/1MlZn5V7VkfcvARPDDRArOjDhSw6Pv2_4tn2NYtWfMTU/edit

package com.pb.kopiton.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Scanner end = new Scanner(System.in);
        System.out.println("Start Game");
        System.out.println("Хотите продолжить? Если да, укажите  Y : ");
        String go = end.next();

        if (go.equals ("Y") || go.equals("y")) {

            int random = (int) (Math.random()*100);

            Scanner a = new Scanner(System.in);
            System.out.println("Угадай число от 0 до 100: ");
            int number = a.nextInt();

            if (number == random) {
                System.out.print ("Вы выйграли :)");
            }

            else {
                System.out.println("Вы не угадали :(");
                System.out.println("Загаданное число " + random);
                if (random>number) {
                    System.out.print("Загаданное число > чем " + number);
                }
                if (random<number) {
                    System.out.println("Загаданое число < чем " + number);
                }
                // do while loop
            }



        }



        else {
            System.out.println("Game Over");
        }

    }

}
