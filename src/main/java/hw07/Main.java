package hw07;

public class Main {
    public static void main(String[] args) {
        Pet dog=new Dog();
        dog.eat();
        dog.respond();
        dog.foul();
        Pet fish=new Fish();
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
        Human human=new Human();
        human.setSchedule(new String[][] {{DayOfWeek.Monday.name(),DayOfWeek.Friday.name()},{"work","rest"}});
        System.out.println(human.toString());

    }


}
