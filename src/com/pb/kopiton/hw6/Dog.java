package com.pb.kopiton.hw6;

public class Dog extends Animal {

    private int dogBit;

    public int getDogBit() {
        return dogBit;
    }

    public void setDogBit(int dogBit) {
        this.dogBit = dogBit;
    }

    public void guards () {
        System.out.println(getName() + " сторожит");
    }

    @Override
    public void eat () {
        System.out.println(getName() + " грызет кость");

    }

    @Override
    public void makeNoise () {
        System.out.println(getName() + " лает");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogBit=" + dogBit +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //super.Veterinarian.
}
