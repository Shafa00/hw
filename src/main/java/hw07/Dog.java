package hw07;

public class Dog extends Pet {
    public Dog(String nickname, int age) {
        super(nickname, age);
    }
    public Dog(){}

    String species=Species.Dog.name();
    @Override
    public void eat() {
        System.out.printf("%s eats meat\n",species);
    }

    @Override
    public void foul() {
        System.out.printf("%s needs to cleaning up\n",species);
    }

    @Override
    public void respond() {
        System.out.printf("%s said haw haw\n",species);
    }

}
