package hw13.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.HashMap;

public class Human {
    public String name;
    public String surname;
    public long birthDate;
    public int iq;
    public HashMap<DayOfWeek, String> schedule;

    public Human() {
    }

    public Human(String name, String surname, String birthDate, int iq, HashMap<DayOfWeek, String> schedule){
        this.name = name;
        this.surname = surname;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try{
        Date date = format.parse(birthDate);
        this.birthDate = date.getTime();
        } catch (Exception e){
            System.out.print("");
        }
        this.iq=iq;
        this.schedule = schedule;
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
            System.out.println("Date format problem");
        }
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public int getIq() {
        return iq;
    }

    public HashMap<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void describeAge() {
        LocalDate finish = LocalDate.now();
        LocalDate start = LocalDate.of(2016, 3, 20);
        Period period = Period.between(start, finish);
        System.out.println("Years:" + period.getYears());
        System.out.println("Months:" + period.getMonths());
        System.out.println("Days:" + period.getDays());
    }

    protected String greetPet() {
        return "hello";
    }

    public String  prettyFormat(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s = dateFormat.format(birthDate);

        return String.format("name:%s, surname:%s, birthDate:%s, iq: %d, schedule:%s"
                , getName(), getSurname(),s,getIq(),getSchedule());
    }

    public String humanToData() {
        return String.format("%s>%s>%d>%d", name, surname, birthDate, iq);
    }


    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s = dateFormat.format(birthDate);

        return String.format("%s>%s>%s>%d", name, surname, s, iq);
    }

}
