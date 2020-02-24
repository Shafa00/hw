package hw04.happyfamily;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Human mother;
    Human father;
    String [][] schedule = new String[2][2];
    Pet pet=new Pet();
    public Human(String name,String surname,int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name,String surname,int year,Human father,Human mother){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
    }
    public Human(String name,String surname,int year,int iq,Human mother,Human father,String[][]schedule){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.father=father;
        this.mother=mother;
        this.schedule=schedule;
    }
    public Human(){
    }
    public void greetPet(){
        System.out.printf("Hello, %s\n",pet.nickname);
    }
    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is ",pet.species,pet.age);
        System.out.println((pet.trickLevel>50) ? "very sly" : "almost not sly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + '\''+ mother.name +' '+ mother.surname +'\''+
                ", father=" + '\''+father.name + ' '+ father.surname +'\'' +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
