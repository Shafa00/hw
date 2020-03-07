package hw06.gc;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    protected Human mother;
    protected Human father;
    protected Human[] children;

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    int countOfChild=3;
    public int addChild(Human child){
           children=Arrays.copyOf(children, countOfChild+1);
           children[countOfChild]=child;
           countOfChild++;
           return countOfChild;
    }

    boolean deleteChild(int index) {
        if (children.length - index > 0){
                children=Arrays.copyOf(children, countOfChild-1);
            countOfChild--;
            return true;
        }
        return false;
    }
    boolean deleteChild(Human child) {
        int index = children.length;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == child) {
                index = i;
            }
        }
        try {
            if (children[index] != null) {
                for (int i = 0; i <children.length-1; i++) {
                    children[i]=children[i+1];
                }
                countOfChild--;
                children=Arrays.copyOf(children, countOfChild-1);
                return true;
            }
        }
        catch (Exception e){
            System.out.println("child not found");
        }
        return false;
    }

    public int countFamily(){
        return 2+children.length;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Family object removed");
    }
}
