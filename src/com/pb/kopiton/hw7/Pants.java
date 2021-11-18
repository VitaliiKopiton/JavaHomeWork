package com.pb.kopiton.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants (Size size, int prince, String colour) {
        super(size, prince, colour);
    }


    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
