package hw07;

public class Fish extends Pet {
    public Fish(String nickname,Species species, int age) {
        super(nickname,species, age);
    }
    public Fish(){ this.species=Species.Fish; }

    @Override
    public void respond() {
        System.out.printf("%s can't make noise\n",species);
    }

}
