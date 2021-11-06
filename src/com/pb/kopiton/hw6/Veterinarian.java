package com.pb.kopiton.hw6;

public class Veterinarian {

    private int vaccination;
    private int patient;

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public int getVaccination() {
        return vaccination;
    }

    public void setVaccination(int vaccination) {
        this.vaccination = vaccination;
    }

    public void treatAnimal(Animal animal) {
        patient ++;
        System.out.println(patient +" пациент");
        System.out.println (animal.getName() + " из " + animal.getLocation() + " питается " + animal.getFood());
        System.out.println (animal.getName() + " привит " + vaccination + " раз");
    }
}
