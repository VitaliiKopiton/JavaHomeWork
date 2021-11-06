package com.pb.kopiton.hw6;

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
