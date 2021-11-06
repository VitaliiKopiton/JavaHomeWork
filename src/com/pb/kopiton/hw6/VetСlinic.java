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


//        veterinarian.treatAnimal(dog);
//        veterinarian.treatAnimal(cat);
//        veterinarian.treatAnimal(horse);

        Animal [] allAnimals = new Animal [3];
        allAnimals [0] = dog;
        allAnimals [1] = cat;
        allAnimals [2] = horse;

        for (int i=0; i < allAnimals.length; i ++) {
            veterinarian.treatAnimal(allAnimals[i]);
        }
        System.out.println("Пациентов нет");
//        veterinarian.treatAnimal(allAnimals[0]);












    }
}
