package hw04.happyfamily;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("","",5,75,new String[]{"sleep","eat","drink"});
        pet.species="dog";
        pet.nickname="Rock";
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println("Person: "+pet.toString());
        //Human
        Human human=new Human("Micheal","Karleone",1997,90,"Viko Karleone","Jane Karleone");
        human.pet.nickname="Rock";
        human.pet.species="dog";
        human.pet.tricklevel=75;
        human.pet.age=5;
        human.greetPet();
        human.describePet();
        System.out.println("Full family: "+human.toString()+pet.toString());

    }
}
