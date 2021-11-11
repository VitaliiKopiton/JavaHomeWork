package com.pb.kopiton.hw6;

public class Animal {

    String [] allAnimal;
    protected String name;
    protected String food;
    protected String location;
    protected int age;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise () {
        System.out.println(name + " Шумит");
    }

    public void eat () {
        System.out.println(name + " eст " + food);

    }

    public void sleep () {
        System.out.println(" животное спит");
    }


}
