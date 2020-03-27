package hw09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    private FamilyService testFamilyService;
    ArrayList<Human> children=new ArrayList<>();
    Woman mother = new Woman("Jane", "Karleone");
    Man father = new Man("Viko", "Karleone");
    Family family= new Family(mother, father, children);


    @BeforeEach
    void setUp() {
        this.testFamilyService = new FamilyService();
        CollectionFamilyDao familyDao = new CollectionFamilyDao();
        familyDao.saveFamily(family);
    }

    @Test
    void getAllFamilies() {
        List<Family> actual = testFamilyService.getAllFamilies();
        List<Family> expected = testFamilyService.families;
        assertEquals(expected,actual);
    }

    @Test
    void displayAllFamilies() {
        List<Family> actual = testFamilyService.displayAllFamilies();
        List<Family> expected = testFamilyService.families;
        assertEquals(expected,actual);
    }

    @Test
    void getFamiliesBiggerThan() {
        int count=3;
        int actual = testFamilyService.getFamiliesBiggerThan(count).size();
        assertEquals(0, actual);
    }

    @Test
    void getFamiliesLessThan() {
        int count=3;
        int actual= testFamilyService.getFamiliesBiggerThan(count).size();
        assertEquals(0, actual);
    }

    @Test
    void countFamiliesWithMemberNumber() {
        int count=3;
        int actual=testFamilyService.countFamiliesWithMemberNumber(count).size();
        assertEquals(0,actual);
    }

    @Test
    void createNewFamily() {
        int actual = testFamilyService.createNewFamily(new Woman("", ""), new Man("", "")).countFamily();
        int expected = testFamilyService.families.size()+1;
        assertEquals(expected,actual);
    }

    @Test
    void deleteFamilyByIndex() {
        boolean actual = testFamilyService.deleteFamilyByIndex(0);
        assertTrue(actual);
    }

    @Test
    void bornChild() {
        int actual = testFamilyService.bornChild(family,"","").children.size();
        int expected = family.getChildren().size();
        assertEquals(expected, actual);
    }

    @Test
    void adoptChild() {
        int actual = family.addChild(new Human("", ""));
        int expected = family.getChildren().size();
        assertEquals(expected, actual);
    }

    @Test
    void deleteAllChildrenOlderThen() {
        int initialExpected = family.getChildren().size();
        testFamilyService.deleteAllChildrenOlderThen(10);
        int finalExpected = family.getChildren().size()-1;
        boolean actual = initialExpected > finalExpected;
        assertTrue(actual);

    }

    @Test
    void count() {
        int expected=testFamilyService.families.size();
        int actual=testFamilyService.count();
        assertEquals(expected, actual);
    }

    @Test
    void getFamilyById() {
        Family actual = testFamilyService.getFamilyById(0);
        Family expected = family;
        assertEquals(expected, actual);
    }

    @Test
    void getPets() {
        HashSet<Pet> actual = testFamilyService.getPets(family);
        HashSet<Pet> expected =family.pet;
        assertEquals(expected, actual);
    }

}