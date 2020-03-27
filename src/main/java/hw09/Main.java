package hw09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Pet pet1=new Pet(Species.Dog,"Rock",new HashSet<>());
        pet1.habits.add("sleep");
        pet1.habits.add("eat");
        pet1.habits.add("walk");
        System.out.println(pet1.toString());

        Pet pet2=new Pet(Species.DomesticCat,"Micky",new HashSet<>());
        pet2.habits.add("play");
        pet2.habits.add("bark");
        pet2.habits.add("sleep");
        System.out.println(pet2.toString());

        Human human=new Human("Ann", "Karleone", new HashMap<>(),1980);
        human.schedule.put(DayOfWeek.Monday,"do homework");
        human.schedule.put(DayOfWeek.Friday,"walk");
        human.schedule.put(DayOfWeek.Sunday,"sleep");
        System.out.println(human.toString());

        Woman mom = new Woman("Anne", "karleone", 1995);
        Man father = new Man("Jonny", "Karleone", 1981);
        ArrayList<Human> children = new ArrayList<>();
        HashSet<Pet> pets = new HashSet<>();
        Family family=new Family(mom, father, children, pets);
        family.children.add(0, human);
        family.pet.add(pet1);
        family.pet.add(pet2);
        family.addChild(human);
        family.addChild(human);
        System.out.println(family.deleteChild(0));
        family.deleteChild(human);
        family.countFamily();
        System.out.println(family.toString());

        FamilyController familyController=new FamilyController();
        CollectionFamilyDao familyDao = new CollectionFamilyDao();
        familyDao.saveFamily(family);

        System.out.println(familyController.getAllFamilies());
        familyController.displayAllFamilies();
        System.out.println(familyController.getFamiliesBiggerThan(3));
        System.out.println(familyController.getFamiliesLessThan(3));
        System.out.println(familyController.countFamiliesWithMemberNumber(3));
        System.out.println(familyController.createNewFamily(family.mother,family.father));
        System.out.println(familyController.deleteFamilyByIndex(0));
        System.out.println(familyController.bornChild(family, "John", "Jane"));
        familyController.adoptChild(family, human);
        familyController.deleteAllChildrenOlderThen(20);
        System.out.println(familyController.count());
        System.out.println(familyController.getFamilyById(0));
        System.out.println(familyController.getPets(family));
        familyController.addPet(family, new Pet(Species.Dog, "Bob", new HashSet<>()));
        System.out.println(familyController.getPets(family));
    }

}
