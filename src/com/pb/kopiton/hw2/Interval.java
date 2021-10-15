package com.pb.kopiton.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите целое цисло: ");
        int b = a.nextInt();
        if (b<15){
            System.out.print("Значение относится к промежутку [0-14]");
            }
        else {
            if (b>14 && b<36) {
                System.out.print("Значение относится к промежутку [15-35]");
                }
            if (b>35 && b<51) {
                System.out.print("Значение относится к промежутку [36-50]");
                }
            if (b>50 && b<101) {
                System.out.print("Значение относится к промежутку [51-100]");
                }
            if (b>100) {
                System.out.print("Введенное число не попадает не в один из имеющихся промежутков");
                }
            }
        }
    }