package hw08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Pet pet1=new Pet(Species.Dog,"Rock",2,76,new HashSet<>());
        pet1.habits.add("sleep");
        pet1.habits.add("eat");
        pet1.habits.add("walk");
        System.out.println(pet1.toString());

        Pet pet2=new Pet(Species.DomesticCat,"Micky",3,87,new HashSet<>());
        pet2.habits.add("play");
        pet2.habits.add("bark");
        pet2.habits.add("sleep");
        System.out.println(pet2.toString());

        Human human=new Human("Ann","Karleone",1998,89,new HashMap<>());
        human.schedule.put(DayOfWeek.Monday,"do homework");
        human.schedule.put(DayOfWeek.Friday,"walk");
        human.schedule.put(DayOfWeek.Sunday,"sleep");
        System.out.println(human.toString());

        Family family=new Family(new Human("Jane", "Karleone",1970,87,new HashMap<>()),
                new Human("Jack", "Karleone",1980,90,new HashMap<>()), new ArrayList<>(), new HashSet<>());
        family.children.add(0, human);
        family.pet.add(pet1);
        family.pet.add(pet2);
        family.addChild(human);
        family.deleteChild(0);
        family.deleteChild(human);
        family.countFamily();
        System.out.println(family.toString());
    }
}
