package com.pb.kopiton.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Scanner fin = new Scanner(System.in);
        System.out.print("Хотите продолжить? Если да, укажите  Y  ");
        String fin1 = fin.next();

        if (fin1.equals ("Y")) {
            int random = (int) (Math.random()*100);

            Scanner a = new Scanner(System.in);
            System.out.print("Угадай число от 0 до 100: ");
            int b = a.nextInt();

        }

    }

}
