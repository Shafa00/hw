package hw10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.util.HashMap;
import java.time.LocalDate;

public class Human {
    public String name;
    public String surname;
    public long birthDate;
    public int iq;
    public HashMap<DayOfWeek, String> schedule;


    public Human(String name, String surname, HashMap<DayOfWeek, String> schedule, String birthDate) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(birthDate);
        this.birthDate = date.getTime();
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, String birthDate, int iq)  {
        this.name = name;
        this.surname = surname;
        this.iq = iq;

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = format.parse(birthDate);
            this.birthDate = date.getTime();

        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public long getYear() {
        return birthDate;
    }


    public HashMap<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public String describeAge() {
        LocalDate finish = LocalDate.now();
        LocalDate start = LocalDate.of(2016, 3, 20);
        Period period = Period.between(start, finish);
        return String.format("Years: %d\nMonths:%d\nDays:%d",period.getYears(),period.getMonths(),period.getDays());
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String s = dateFormat.format(birthDate);

        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + s +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
}
