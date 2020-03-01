package hw07;

public class Main {
    public static void main(String[] args) {
        Pet dog=new Dog();
        dog.eat();
        dog.respond();
        dog.foul();
        Pet fish=new Fish() {
            @Override
            public void foul() {}
        };
        fish.eat();
        fish.respond();
        Pet domestiCat=new DomestiCat();
        domestiCat.eat();
        domestiCat.respond();
        domestiCat.foul();
        Pet roboCat=new RoboCat();
        roboCat.eat();
        roboCat.foul();
        roboCat.respond();

    }


}
