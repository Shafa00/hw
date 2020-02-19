package Inheritance;

public class Animal {
    public static void main(String[] args) {
        System.out.println("I'm an Animal");
        Cat cat=new Cat("Tom");
        Dog dog=new Dog("Micky");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}
