package hw13.dao;

import hw13.entity.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class FamilyService {
    DAO<Family> familyDAO = new CollectionFamilyDao();
    List<Family> families = familyDAO.getAllFamilies();

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
    public List<Family> createNewFamily(Woman woman, Man man , Pet pet){
        ArrayList<Human> children = new ArrayList<>();
        HashSet<Pet> pets =new HashSet<>();
        Family family = new Family(woman, man,children,pets);
        pets.add(pet);
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
        int today = 2020;
        for (Family family: families) {
            family.getChildren().removeIf(child -> age > (today-child.getBirthDate()));
            familyDAO.saveFamily(family);
        return true;}
        return false;
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

    public void loadData(){
        familyDAO.loadData();
    }

    public void getData() {
        File file = new File("src/main/java/hw13/families.txt");
        List<Family> familyList = new ArrayList<>();

        if(familyList.size()==0) {
            try {
                List<String> lines = new BufferedReader(new FileReader(file)).lines().collect(Collectors.toList());
                lines.stream().map(line -> line.split("#")).forEach(splitted -> {
                    String[] mother = splitted[0].split(">");

                    long motherBirthDate = Long.parseLong(mother[2]);
                    LocalDate date = Instant.ofEpochMilli(motherBirthDate).atZone(ZoneId.systemDefault()).toLocalDate();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String formattedMotherBirthDate = date.format(formatter);


                    Woman woman = new Woman(mother[0], mother[1], formattedMotherBirthDate, Integer.parseInt(mother[3]));

                    String[] father = splitted[1].split(">");

                    long fatherBirthDate = Long.parseLong(father[2]);
                    LocalDate date2 = Instant.ofEpochMilli(fatherBirthDate).atZone(ZoneId.systemDefault()).toLocalDate();
                    String  formattedFatherBirthDate= date2.format(formatter);

                    Man man = new Man(father[0], father[1], formattedFatherBirthDate, Integer.parseInt(father[3]));


                    String[] children = splitted[2].split(",");
                    String[] pets = splitted[3].split(";");

                    ArrayList<Human> childrenList = new ArrayList<>();
                    HashSet<Pet> familyPets = new HashSet<>();

                    for (String childData : children) {
                        String[] c1 = childData.split(">");
                        String name = c1[0];
                        String surname = c1[1];
                        String birthDate = c1[2];
                        String iq = c1[3].replaceAll(",", "");

                        long childBirthdate = Long.parseLong(birthDate);
                        LocalDate date3 = Instant.ofEpochMilli(childBirthdate).atZone(ZoneId.systemDefault()).toLocalDate();
                        String formattedBirthDate = date3.format(formatter);

                        childrenList.add(new Human(name, surname, formattedBirthDate, Integer.parseInt(iq)));
                    }

                    for (String petData : pets) {
                        String[] p1 = petData.split("~");
                        String name = p1[0];
                        String age = p1[1];
                        String trickLevel = p1[2];
                        String habits = p1[3].replaceAll(";\\[", "").replaceAll("]", "");

                        String[] habitArray = habits.split(", ");

                        HashSet<String> petHabit = new HashSet<>();
                        for (String h : habitArray) petHabit.add(h);

                        familyPets.add(new Pet(name, Integer.parseInt(age), Integer.parseInt(trickLevel), petHabit));

                    }
                    familyList.add(new Family(woman, man, childrenList, familyPets));
                });
                families.addAll(familyList);

            } catch (IOException e) {
                System.out.println("File does not found");
            }
        }



    }

}

