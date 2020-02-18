package hw04.happyfamily;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    String mother;
    String father;
    Pet pet=new Pet();
    String [][] schedule=new String[3][3];
    public Human(String Name,String Surname,int Year){
        name=Name;
        surname=Surname;
        year=Year;
    }
    public Human(String Name,String Surname,int Year,String Father,String Mother){
        name=Name;
        surname=Surname;
        year=Year;
        father=Father;
        mother=Mother;
    }
    public Human(String Name,String Surname,int Year,int IQ,String Mother,String Father){
        name=Name;
        surname=Surname;
        year=Year;
        iq=IQ;
        father=Father;
        mother=Mother;
    }
    public Human(){
    }
    public void greetPet(){
        System.out.printf("Hello, %s\n",pet.nickname);
    }
    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is ",pet.species,pet.age);
        String level;
        System.out.println(level=(pet.tricklevel>50) ? "very sly" : "almost not sly");
    }
    public String toString(){
        return("name="+name+",surname="+surname+",year="+year+",iq= "+iq+",mother="+mother+
                ",father="+father);
    }

}
