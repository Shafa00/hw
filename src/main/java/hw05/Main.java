package hw05;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.setSpecies("dog");
        pet.setNickname("Rock");
        pet.setAge(5);
        pet.setTrickLevel(70);
        Human child=new Human("Micheal","Karleone");
        Human children[]=new Human[5];
        pet.setHabits(new String[]{"sleep","eat","drink"});
        Human human=new Human();
        human.setYear(1990);
        human.setIq(93);
        human.setSchedule(new String[][]{{"Monday","Sunday"},{"work","rest"}});
        Family fam=new Family();
        Family family=new Family(fam.getMother(),fam.getFather(),children);
        family.addChild(child);
        family.deleteChild(0);
        family.countFamily();
        System.out.println(pet.toString());
        System.out.println(human.toString());
        System.out.println(family.toString());

    }
}
