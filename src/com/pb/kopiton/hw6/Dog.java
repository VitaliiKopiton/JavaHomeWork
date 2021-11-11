package com.pb.kopiton.hw6;

import java.util.Objects;

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
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", dogBit=" + dogBit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return dogBit == dog.dogBit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogBit);
    }

    //super.Veterinarian.
}
