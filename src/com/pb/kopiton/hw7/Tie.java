package com.pb.kopiton.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie (Size size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("uгалстук");
    }
}
