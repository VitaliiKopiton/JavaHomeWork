package com.pb.kopiton.hw4;

import java.util.Scanner;


public class CapitalLetter {


    static String Register (String word) {
        StringBuilder temp2Text = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).matches("[a-zA-Zа-яА-Я]")) {
                temp2Text.append(word.substring(i, i + 1).toUpperCase()).append(word.substring(i+1));
                break;
            }
            temp2Text.append(word.substring(i, i+1));
        }
        return temp2Text.toString();
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        String[] wordsArray = text.split (" ");
        StringBuilder tempText = new StringBuilder();

        for (int i=0; i < wordsArray.length; i++) {
            tempText.append(Register (wordsArray[i]));
            if (i != wordsArray.length -1) {
                tempText.append(" ");
            }
        }


        System.out.println(tempText);

    }
}
