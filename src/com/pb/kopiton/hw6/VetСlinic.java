package com.pb.kopiton.hw6;

public class VetСlinic {
    public static void main(String[] args) {

//        Animal anim = new Animal ();
//        anim.setFood("water");
//        anim.setName("Flash");
//        anim.setAge(5);

        Dog dog = new Dog ();
        dog.setFood ("людьми");
        dog.setName("Шаприк");
        dog.setLocation("Корея");
        dog.setAge(12);
        dog.setDogBit(0);

        Cat cat = new Cat();
        cat.setName("Стич");
        cat.setFood ("рыба");
        cat.setLocation("Одесса");
        cat.setAge(3);
        cat.setCatchMouse(0);

        Horse horse = new Horse();
        horse.setName("Буян");
        horse.setFood("сено");
        horse.setLocation("Румыния");
        horse.setKickedHoof(0);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setVaccination(0);


        cat.eat();
        cat.play();

        dog.makeNoise();
        dog.guards();
        horse.rides();
        dog.eat();


        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(cat);
        veterinarian.treatAnimal(horse);












    }
}
