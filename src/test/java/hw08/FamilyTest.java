package hw08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private Family testFamily;

    @BeforeEach
    void before() {
        ArrayList<Human> children = new ArrayList<>();
        Human mother = new Human("Jane", "Karleone");
        Human father = new Human("Viko", "Karleone");
        children.add(0, new Human("Jenny", "Karleone"));
        this.testFamily = new Family(mother, father, children);
    }
    @Test
    void addChild() {
        Human child =new Human("Ann", "Karleone");
        int expected=testFamily.children.size()+1;
        int actual=testFamily.addChild(child);
        assertEquals(expected, actual);
    }

    @Test
    void deleteChild() {
        boolean actual=testFamily.deleteChild(0);
        assertTrue(actual);
    }

    @Test
    void deleteChild1() {
        Human child =new Human("Jenny", "Karleone");
        boolean actual=testFamily.deleteChild(child);
        assertTrue(actual);
    }

    @Test
    void countFamily() {
        int actual=testFamily.countFamily();
        assertEquals(3, actual);
    }
}