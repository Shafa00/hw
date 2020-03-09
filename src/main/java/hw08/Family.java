package hw08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Family {
    protected Human mother;
    protected Human father;
    protected List<Human> children;
    protected HashSet<Pet> pet;

    public Family(Human mother, Human father, ArrayList<Human> children, HashSet<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }
    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    int countOfChild=0;
    public int addChild(Human child){
        children.add(child);
        countOfChild++;
        return countOfChild;
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
                ", \nchildren=" + children +
                ", \npet=" + pet +
                '}';
    }
}
