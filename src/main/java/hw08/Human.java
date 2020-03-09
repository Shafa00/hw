package hw08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Human {
    protected String name;
    protected String surname;
    protected HashMap<DayOfWeek,String> schedule;

    public Human(String name, String surname, HashMap<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
