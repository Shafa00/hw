package hw07;

public class DomestiCat extends Pet{
    public DomestiCat(String nickname,Species species, int age) {
        super(nickname,species,age);
    }
    public DomestiCat(){this.species=Species.DomesticCat;}

    @Override
    public void foul() {
        System.out.printf("%s needs cleaning up.\n",species);
    }

    @Override
    public void respond() {
        System.out.printf("%s responds miyav\n",species);
    }
}
