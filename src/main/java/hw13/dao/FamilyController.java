package hw13.dao;

import hw13.entity.*;

import java.util.HashSet;
import java.util.List;

public class FamilyController {
    FamilyService familyService=new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }


    public List<Family> displayAllFamilies() {
        return familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return familyService.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count) {
        return familyService.getFamiliesLessThan(count);
    }

    public List<Family> countFamiliesWithMemberNumber(int count) {
        return familyService.countFamiliesWithMemberNumber(count);
    }

    public List<Family> createNewFamily(Woman woman, Man man, Pet pet) {
        return familyService.createNewFamily(woman, man, pet);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String boyName, String girlName) {
        return familyService.bornChild(family, boyName, girlName);
    }

    public void adoptChild(Family family, Human human) {
        familyService.adoptChild(family, human);
    }

    public boolean deleteAllChildrenOlderThen(int age) {
        return familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int index) {
        return familyService.getFamilyById(index);
    }

    public HashSet<Pet> getPets(Family family) {
        return familyService.getPets(family);
    }

    public void addPet(Family family, Pet newPet) {
        familyService.addPet(family, newPet);
    }

    public void loadData(){
        familyService.loadData();
    }

    public void getData() {familyService.getData();}
}
