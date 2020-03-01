package hw07;

public abstract class Fish extends Pet {
    public Fish(String nickname, int age) {
        super(nickname, age);
    }
    public Fish(){
        super();
    }

    String species=Species.Fish.name();
    @Override
    public void eat() {
        System.out.printf("%s eats grass\n",species);
    }

    @Override
    public void respond() {
        System.out.printf("%s can't make noise\n",species);
    }

}
