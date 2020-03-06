package hw06.gc;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    protected String name;
    protected String surname;
    protected String [][] schedule;
    public Human(){}

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname,String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Human object removed");
    }
}
