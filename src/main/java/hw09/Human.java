package hw09;

import java.util.HashMap;

public class Human {
    public String name;
    public String surname;
    private int year;
    public HashMap<DayOfWeek,String> schedule;

    public Human(String name, String surname, HashMap<DayOfWeek, String> schedule,int year) {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
        this.year=year;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public HashMap<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public String greetPet() {
        return "Hello!";
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
