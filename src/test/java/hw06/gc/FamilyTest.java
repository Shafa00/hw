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
        testFamily.addChild(child);
        assertEquals(3, testFamily.children.length);
    }
    @Test
    void deleteChild() {
        Human child = new Human("Jack", "Karleone");
        assertEquals(true, testFamily.deleteChild(0));
    }

    @Test
    void countOfFamily() {
        Human child = new Human("Jack", "Karleone");
        testFamily.addChild(child);
        assertEquals(5, testFamily.countFamily());

    }
}