package hw12.dao;

import hw12.entity.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class FamilyService {
    DAO<Family> familyDAO = new CollectionFamilyDao();
    List<Family> families = familyDAO.getAllFamilies();

    public void saveFamily(Family family){
        familyDAO.saveFamily(family);
    }
    public List<Family> getAllFamilies() {
        return families;
    }

    public List<Family> displayAllFamilies() {
        families.forEach(family -> System.out.println(family.prettyFormat()));
        return families;
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        ArrayList<Family> bigFamily = families.stream().filter(family -> family.countFamily() > count).collect(Collectors.toCollection(ArrayList::new));
        bigFamily.forEach(family -> System.out.println(family.prettyFormat()));
        return bigFamily;
    }
    public List<Family> getFamiliesLessThan(int count) {
        ArrayList<Family> littleFamily = families.stream().filter(family -> family.countFamily() < count).collect(Collectors.toCollection(ArrayList::new));
        littleFamily.forEach(family -> System.out.println(family.prettyFormat()));
        return littleFamily;
    }
    public List<Family> countFamiliesWithMemberNumber(int count) {
        ArrayList<Family> equalFamily = families.stream().filter(family -> family.countFamily() == count).collect(Collectors.toCollection(ArrayList::new));
        equalFamily.forEach(family -> System.out.println(family.prettyFormat()));
        return equalFamily;
    }
    public List<Family> createNewFamily(Woman woman, Man man){
        ArrayList<Human> children = new ArrayList<>();
        HashSet<Pet> pets =new HashSet<>();
        Family family = new Family(woman, man,children,pets);
        families.add(family);
        return families;
    }
    public boolean deleteFamilyByIndex(int index) {
        if (index<=families.size()){
            families.remove(index);
            return true;}
        return false;
    }
    public Family bornChild(Family family, String boyName, String girlName){
        Random random= new Random();
        int a=random.nextInt(2);
        if(a==0){
            family.addChild(new Human(boyName, family.father.getSurname()));
        }
        else if(a==1){
            family.addChild(new Human(girlName, family.father.getSurname()));
        }
        return family;
    }
    public List<Human> adoptChild(Family family, Human human){
        return  family.addChild(human);
    }

    public boolean deleteAllChildrenOlderThen(int age){
        try{
            families.forEach(family -> {
                int currentYear = LocalDate.now().getYear();
                family.getChildren().removeIf(child -> age < (currentYear -
                        Instant.ofEpochMilli(child.getBirthDate()).atZone(ZoneId.systemDefault()).toLocalDate().getYear()));
                saveFamily(family);
            });
            return true;
        }
        catch (Exception e) {
            return false;
        }

    }
    public int count(){
        return families.size();
    }
    public Family getFamilyById(int index) {
        return familyDAO.getFamilyByIndex(index);
    }

    public HashSet<Pet> getPets(Family family){return family.getPet();}

    public void addPet(Family family, Pet newPet){
        family.pet.add(newPet);
        familyDAO.saveFamily(family);
    }

    public void data(){
        List<Family> families = new ArrayList<>();

        Woman mother = new Woman("Kate", "Bibo","03/03/1991",95, new HashMap<>());
        mother.schedule.put(DayOfWeek.Friday, "fitness");
        mother.schedule.put(DayOfWeek.Monday, "fitness");

        Man father = new Man("Karl", "Bibo", "10/12/1990",90, new HashMap<>());
        father.schedule.put(DayOfWeek.Friday, "library");
        father.schedule.put(DayOfWeek.Monday, "library");

        ArrayList<Human> children = new ArrayList<>();
        Human child1= new Human("Donna", "Bibo", "23/10/2018", 92);
        Human child2= new Human("Sun", "Bibo", "23/10/2018", 92);
        Human child3= new Human("Kurt","Kobein","05/05/2003", 85,new HashMap<>());
        child3.schedule.put(DayOfWeek.Friday,"music");
        children.add(child1);
        children.add(child2);
        children.add(child3);
        HashSet<Pet> pets = new HashSet<>();
        Pet pet1=new Pet(Species.Dog,"Jack", 3,35,new HashSet<>());
        pet1.habits.add("sleep");
        Pet pet2=new Pet(Species.Cat,"Oscar",5, 81,new HashSet<>());
        pet2.habits.add("eat");
        pet2.habits.add("play");
        pets.add(pet1);
        pets.add(pet2);
        Family family1=new Family(mother,father,children,pets);


        Woman mother2 = new Woman("Jane", "Karleone","23/05/1991",90, new HashMap<>());
        mother.schedule.put(DayOfWeek.Monday, "fitness");
        mother.schedule.put(DayOfWeek.Saturday, "walk");

        Man father2 = new Man("John", "Karleone", "25/12/1989",92, new HashMap<>());
        father.schedule.put(DayOfWeek.Sunday, "library");
        father.schedule.put(DayOfWeek.Monday, "work");

        ArrayList<Human> children2 = new ArrayList<>();
        Human child21= new Human("Mark", "Karleone", "23/12/2019", 92);
        Human child22= new Human("Jenny", "Karleone", "23/11/2018", 92);
        Human child23= new Human("Ben","Kobein","09/05/2005", 85,new HashMap<>());
        child3.schedule.put(DayOfWeek.Sunday,"music");
        children2.add(child21);
        children2.add(child22);
        children2.add(child23);
        HashSet<Pet> pets2 = new HashSet<>();
        Pet pet21=new Pet(Species.Dog,"Bark", 2,35,new HashSet<>());
        pet21.habits.add("sleep");
        Pet pet22=new Pet(Species.Cat,"Tom",4, 81,new HashSet<>());
        pet22.habits.add("eat");
        pet22.habits.add("play");
        pets2.add(pet21);
        pets2.add(pet22);
        Family family2=new Family(mother2,father2,children2,pets2);
        families.add(family1);
        families.add(family2);
        familyDAO.getAllFamilies().addAll(families);
    }


}

