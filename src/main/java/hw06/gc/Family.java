package hw06.gc;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    protected Human mother;
    protected Human father;
    protected Human[] children;
    int countOfChild=0;

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }
    public Family(){}

    public void addChild(Human child){
            children[countOfChild]=child;
            countOfChild++;
    }

    boolean deleteChild(int index) {
        if (children.length - index > 0){
                System.arraycopy(children, index + 1, children, index, children.length - 1 - index);
            countOfChild--;
            return true;
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
