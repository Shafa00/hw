package hw06.gc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    private Family testFamily;

    @BeforeEach
    void before() {
        Human[] children = new Human[3];
        Human mother = new Human("Jane", "Karleone");
        Human father = new Human("Viko", "Karleone");
        this.testFamily = new Family(mother, father, children);
    }

    @Test
    void addChild() {
        Human child = new Human("Jack", "Karleone");
        int expected=testFamily.countOfChild+1;
        int actual=testFamily.addChild(child);
        assertEquals(expected, actual);
    }
    @Test
    void deleteChild() {
        boolean expected=true;
        boolean actual=testFamily.deleteChild(0);
        assertEquals(expected, actual);
    }

    @Test
    void deleteChild2() {
        Human child = new Human("Jack", "Karleone");
        testFamily.deleteChild(0);
        boolean expected=false;
        boolean actual=testFamily.deleteChild(child);
        assertEquals(expected, actual);
    }

    @Test
    void countOfFamily() {
        addChild();
        int actual=testFamily.countFamily();
        assertEquals(6, actual);

    }
}