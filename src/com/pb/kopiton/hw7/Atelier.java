package com.pb.kopiton.hw7;

import static com.pb.kopiton.hw7.Size.*;

public class Atelier {
    public static void main(String[] args) {

        Clothes[] clothes = new Clothes[] {
            new Tshirt (S, 58, "розовый"),
                new Pants (M, 75, "красный"),
                new Skirt (L,14, "зеленый"),
                new Tie (XS, 25, "синий")

        };

        dressMan(clothes);

        System.out.println();

        dressWomen(clothes);
    }


    private static void dressMan(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }







}
