package hw13.entity;


import java.util.HashMap;

public final class Woman extends Human {

    public Woman(String name, String surname, String birthDate, int iq, HashMap<DayOfWeek, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Woman(String name, String surname) {
        super(name, surname);
    }

    public Woman(String name, String surname, String birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    @Override
    public String greetPet() {
        return super.greetPet();
    }

    public void repairCar(){
        System.out.println("He repair car");
    }

}
