package com.pb.kopiton.hw6;

public class Cat extends Animal {

    private int catchMouse;

    public int getCatchMouse() {
        return catchMouse;
    }

    public void setCatchMouse(int catchMouse) {
        this.catchMouse = catchMouse;
    }

    public void play () {
        System.out.println(getName() + " играет");
    }

    @Override
    public void eat () {
        System.out.println(getName() +" лакает молоко");

    }

    @Override
    public void makeNoise () {
        System.out.println(getName() + " мурчит");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
