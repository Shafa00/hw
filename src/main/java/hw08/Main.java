package hw08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Pet pet1=new Pet("dog","Rock",new HashSet<>());
        pet1.habits.add("sleep");
        pet1.habits.add("eat");
        pet1.habits.add("walk");
        System.out.println(pet1.toString());

        Pet pet2=new Pet("cat","Micky",new HashSet<>());
        pet2.habits.add("play");
        pet2.habits.add("bark");
        pet2.habits.add("sleep");
        System.out.println(pet2.toString());

        Human human=new Human("Ann", "Karleone", new HashMap<>());
        human.schedule.put(DayOfWeek.Monday,"do homework");
        human.schedule.put(DayOfWeek.Friday,"walk");
        human.schedule.put(DayOfWeek.Sunday,"sleep");
        System.out.println(human.toString());

        Family family=new Family(new Human("Jane", "Karleone"),
                new Human("Jack", "Karleone"), new ArrayList<>(), new HashSet<>());
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
