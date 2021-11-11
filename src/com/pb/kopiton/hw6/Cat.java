package com.pb.kopiton.hw6;

import java.util.Objects;

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
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", catchMouse=" + catchMouse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catchMouse == cat.catchMouse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(catchMouse);
    }
}
