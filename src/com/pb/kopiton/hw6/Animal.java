package com.pb.kopiton.hw6;

public class Animal {

    private String name;
    private String food;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise () {
        System.out.println(name + " Шумит");
    }

    public void eat () {
        System.out.println("Ест");

    }

    public void sleep () {
        System.out.println(" животное спит");
    }


}
