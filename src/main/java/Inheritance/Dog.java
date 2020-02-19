package Inheritance;

public class Dog extends Animal {
    String nameDog;
    public Dog(String nameDog){
        this.nameDog=nameDog;
    }

    @Override
    public String toString() {
        return "my name is " +nameDog;
    }
}