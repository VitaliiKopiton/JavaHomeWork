package com.pb.kopiton.hw6;

import java.util.Objects;

public class Horse extends Animal {

    public int kickedHoof;

    public int getKickedHoof() {
        return kickedHoof;
    }

    public void setKickedHoof(int kickedHoof) {
        this.kickedHoof = kickedHoof;
    }

    public void rides () {
        System.out.println(getName() + " скачет");
    }

    @Override
    public void eat () {
        System.out.println(getName()+ " пасется");
    }


    @Override
    public void makeNoise () {
        System.out.println(getName() + " ржет");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", kickedHoof=" + kickedHoof +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return kickedHoof == horse.kickedHoof;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kickedHoof);
    }
}
