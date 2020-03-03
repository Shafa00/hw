package hw07;

public class Dog extends Pet {
    public Dog(String nickname,Species species, int age) {
        super(nickname,species, age);

    }
    public Dog(){
        this.species=Species.Dog;
    }

    @Override
    public void foul() {
        System.out.printf("%s needs cleaning up\n",this.species);
    }

    @Override
    public void respond() {
        System.out.printf("%s said haw haw\n",species);
    }

}
