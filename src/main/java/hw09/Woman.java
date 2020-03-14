package hw09;

import hw09.Human;

import java.util.HashMap;

public final class Woman extends Human {

    public Woman(String name, String surname, HashMap<DayOfWeek, String> schedule, int year) {
        super(name, surname, schedule, year);
    }

    public Woman(String name, String surname) {
        super(name, surname);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public String greetPet() {
        return super.greetPet();
    }

    public void makeUp(){
        System.out.println("She needs makeUp\n");
    }

}
