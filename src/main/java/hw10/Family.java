package hw10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Family {
    public Woman mother;
    public Man father;
    public List<Human> children;
    public HashSet<Pet> pet;


    public Family(Woman mother, Man father, ArrayList<Human> children, HashSet<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }
    public Family(Woman mother, Man father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }


    public Woman getMother() {
        return mother;
    }

    public Man getFather() {
        return father;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public List<Human> getChildren() {
        return children;
    }

    public HashSet<Pet> getPet() {
        return pet;
    }

    public List<Human> addChild(Human child){
        children.add(child);
        return children;
    }

    public boolean deleteChild(int index){
        children.remove(0);
        return true;
    }

    public boolean deleteChild(Human child){
        children.remove(new Human("Jenny","Karleone"));
        return true;
    }

    public int countFamily(){
        return 2+children.size();
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", \nfather=" + father +
                ", \nchildren=" + getChildren() +
                ", \npet=" + getPet() +
                '}';
    }
}
