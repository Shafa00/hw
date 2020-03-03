package hw07;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    String[][] schedule;
    Human mother;
    Human father;
    public Human(){}
    public Human(String name, String surname, int year, int iq, String[][] schedule, Human mother, Human father){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.father=father;
        this.mother=mother;
        this.schedule=schedule;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "schedule=" + Arrays.deepToString(getSchedule()); }

    public void greetPet(){}
}
