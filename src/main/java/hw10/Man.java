package hw10;

import hw09.DayOfWeek;
import hw09.Human;

import java.util.HashMap;

public final class Man extends Human {
    public Man(String name, String surname, HashMap<DayOfWeek, String> schedule, int year) {
        super(name, surname, schedule, year);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public String greetPet() {
        return super.greetPet();
    }

    public void repairCar(){
        System.out.println("I can repair your car.\n");
    }

}
