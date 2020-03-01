package hw07;

public abstract class Human {
    String name;
    String surname;
    int year;
    int iq;
    Human mother;
    Human father;
    public Human(String name,String surname,int year,int iq,Human mother,Human father){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.father=father;
        this.mother=mother;
    }
    public abstract void greetPet();
}
