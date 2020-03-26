package hw13.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Family {
    public Woman mother;
    public Man father;
    public List<Human> children;
    public HashSet<Pet> pet;

    public Family() {
    }

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
        if (index>=0 && index<children.size()){
        children.remove(index);
        return true;}
        return false;
    }

    public boolean deleteChild(Human child){
        children.remove(child);
        return true;
    }

    public int countFamily(){
        return 2+children.size();
    }

    public String childrenFormatter(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();

        for (Human child : children){
            sb.append(String.format("   {name:%s, surname:%s, birthDate:%s, iq: %d, schedule:%s}\n", child.getName(), child.getSurname(),
                    dateFormat.format(child.getBirthDate()), child.getIq(), child.getSchedule()));
        }
        return sb.toString();
    }

    public String  prettyFormat(){
        return String.format("family:\n  mother: %s \n  father: %s\n  children:\n%s  pets: %s"
                , getMother().prettyFormat(), getFather().prettyFormat(),childrenFormatter(),getPet());
    }

    public String petToData() {
        StringBuilder petBuilder = new StringBuilder();

        for (Pet pet1 : pet) petBuilder.append(pet1.petToData()).append(",");
        return petBuilder.toString();
    }

    public String childToData() {
        StringBuilder childBuilder = new StringBuilder();
        for (Human child: children) childBuilder.append(child.humanToData()).append(",");
        return childBuilder.toString();
    }

    public String familyToData() {
        return String.format("%s#%s#%s#%s", mother.humanToData(), father.humanToData(), childToData(), petToData());
    }

    @Override
    public String toString() {

        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}", mother, father, children, petToData());
    }
}
