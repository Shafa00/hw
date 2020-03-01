package hw07;

public class DomestiCat extends Pet{
    public DomestiCat(String nickname, int age) {
        super(nickname, age);
    }
    public DomestiCat(){}

    String species=Species.DomestiCat.name();
    @Override
    public void foul() {
        System.out.printf("%s needs cleaning up.\n",species);
    }

    @Override
    public void eat() {
        System.out.printf("%s eats bread\n",species);
    }

    @Override
    public void respond() {
        System.out.printf("%s responds miyav\n",species);
    }
}
