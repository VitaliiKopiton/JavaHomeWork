package com.pb.kopiton.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {


    static String Anag (String text) {
        String [] textOut = new String [text.length()];
        for (int i=0; i < text.length(); i++) {
            if (text.substring(i, i + 1).matches("[a-zа-я]")) {
                textOut[i] = text.substring(i, i + 1);

            }
        }

        Arrays.sort(textOut);

        String str = Arrays.toString(textOut);
        return str;

    }



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый текст");
        String inText1 = scanner.nextLine();

        System.out.println("Введите второй текст");
        String inText2 = scanner.nextLine();

         String text1Lower = inText1.toLowerCase();
         String text2Lower = inText2.toLowerCase();



        if (Anag(text1Lower).equals(Anag(text2Lower))) {
            System.out.println("Анаграмма");
        } else {
            System.out.println("Не анаграмма ");
        }

    }

}

