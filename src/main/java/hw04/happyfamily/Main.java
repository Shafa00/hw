package hw04.happyfamily;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("","",5,75,new String[]{"sleep","eat","drink"});
        pet.species="Dog";
        pet.nickname="Rock";
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println("Person: "+pet.toString());
        Human human = new Human("Micheal","Karleone",1997,90,new Human("Jane","Karleone",1970),
                new Human("Viko","Karleone",1968), new String[][]{{"Monday","Friday"},{"work","sleep"}});
        human.pet.nickname="Rock";
        human.pet.species="dog";
        human.pet.trickLevel=75;
        human.pet.age=5;
        human.greetPet();
        human.describePet();
        System.out.println(human.toString());
        System.out.println(pet.toString());

    }
}
