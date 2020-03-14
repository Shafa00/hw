package hw11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FamilyService {
    DAO<Family> familyDAO = new CollectionFamilyDao();
    List<Family> families = familyDAO.getAllFamilies();

    public List<Family> getAllFamilies() {
        return families;
    }

    public List<Family> displayAllFamilies() {
        return families.stream().collect(Collectors.toList());
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        ArrayList<Family> bigFamily = families.stream().filter(family -> family.countFamily() > count).collect(Collectors.toCollection(ArrayList::new));
        return bigFamily;
    }
    public List<Family> getFamiliesLessThan(int count) {
        ArrayList<Family> littleFamily = families.stream().filter(family -> family.countFamily() < count).collect(Collectors.toCollection(ArrayList::new));
        return littleFamily;
    }
    public List<Family> countFamiliesWithMemberNumber(int count) {
        ArrayList<Family> equalFamily = families.stream().filter(family -> family.countFamily() == count).collect(Collectors.toCollection(ArrayList::new));
        return equalFamily;
    }
    public Family createNewFamily(Woman woman, Man man){
        ArrayList<Human> children=new ArrayList<>();
        return new Family(woman, man, children);
    }
    public boolean deleteFamilyByIndex(int index) {
        if (index<families.size()){
            families.remove(index);
            return true;}
        return false;
    }
    public Family bornChild(Family family, String boyName, String girlName){
        Random random= new Random();
        int a=random.nextInt(2);
        if(a==0){
            family.addChild(new Human(boyName, "Smith"));
        }
        else if(a==1){
            family.addChild(new Human(girlName, "Karleone"));
        }
        return family;
    }
    public List<Human> adoptChild(Family family, Human human){
        return  family.addChild(human);
    }

    public void deleteAllChildrenOlderThen(int age){
        int today = 2020;
        for (Family family: families) {
            family.getChildren().removeIf(child -> age > (today-child.getYear()));
            familyDAO.saveFamily(family);
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


}

