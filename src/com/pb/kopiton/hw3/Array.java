package com.pb.kopiton.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];
        int sumArray = 0;
        boolean isSorted = false;
        int buf;


        for (int i=0; i<10; i++){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + "-ое значение" );
            array[i] = scanner.nextInt();

        }

        System.out.print("Введенный массив: [" + array[0] + ", ");
        System.out.print(array[1] + ", ");
        System.out.print(array[2] + ", ");
        System.out.print(array[3] + ", ");
        System.out.print(array[4] + ", ");
        System.out.print(array[5] + ", ");
        System.out.print(array[6] + ", ");
        System.out.print(array[7] + ", ");
        System.out.print(array[8] + ", ");
        System.out.println(array[9] + "]");
        System.out.println("Сумма всех значений: " + (array[0] + array[1]+ array[2]+ array[3]+ array[4]+ array[5]+ array[6]+ array[7]+ array[8]+ array[9]));

        for (int i=0; i<10; i++){
            if (array[i] > 0) {
                sumArray = sumArray + array[i];
            }
        }
        System.out.println("Сумма положительных элементов массива: " + sumArray );



        while (!isSorted) {               // не понятно
            isSorted = true;              // выход если isSorted = true
            for (int i=0; i<9; i++) {
                if (array[i]>array[i+1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;

                }

            }

        }

        System.out.print("Массив после сортировки: [" + array[0] + ", ");
        System.out.print(array[1] + ", ");
        System.out.print(array[2] + ", ");
        System.out.print(array[3] + ", ");
        System.out.print(array[4] + ", ");
        System.out.print(array[5] + ", ");
        System.out.print(array[6] + ", ");
        System.out.print(array[7] + ", ");
        System.out.print(array[8] + ", ");
        System.out.println(array[9] + "]");
    }

}
