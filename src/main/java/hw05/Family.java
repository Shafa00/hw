package hw05;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;
    Human human;
    Family family;
    int countOfChild=0;

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }
    public Family(){}

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Arrays.equals(children, family.children) &&
                pet.equals(family.pet) &&
                Objects.equals(human, family.human);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet, human);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    public void addChild(Human child){
        this.children[this.countOfChild]=child;
        this.countOfChild++;
    }

    public boolean deleteChild(int index){
        if (index>=0 && index<children.length){
            for (int i =0; i <children.length ; i++) {
                if (i == index) {
                    ///???
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public int countFamily(){
        return 2+children.length;
    }

}
