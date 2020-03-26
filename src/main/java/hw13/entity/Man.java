package hw13.entity;

import java.util.HashMap;

public final class Man extends Human {
    public Man() {
    }

    public Man(String name, String surname, String birthDate, int iq, HashMap<DayOfWeek, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Man(String name, String surname) {
        super(name, surname);
    }

    public Man(String name, String surname, String birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    @Override
    public String greetPet() {
        return super.greetPet();
    }

    public void repairCar(){
        System.out.println("I can repair your car.\n");
    }

}
