package hw08;

import hw05.Family;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    public HashMap<DayOfWeek,String> schedule;

    public Human(String name, String surname, int year,int iq,HashMap<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
        this.year = year;
        this.iq = iq;
    }
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public HashMap<DayOfWeek,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<DayOfWeek,String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
}
