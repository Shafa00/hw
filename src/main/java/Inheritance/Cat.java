package Inheritance;

public class Cat extends Animal{
    String nameCat;
    public Cat(String nameCat){
        this.nameCat=nameCat;
    }
    @Override
    public String toString() {
        return "my name is " +nameCat;
    }
}
