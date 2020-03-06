package hw06.gc;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.nickname="Rock";
        pet.species=Species.Dog;
        System.out.println(pet.toString());
        Human human=new Human("John", "Karleone",new String[][]{{DayOfWeek.Monday.name(),DayOfWeek.Friday.name()},{"do homework","sleep"}});
        Human mother=new Human("Jane", "Karleone",new String[][]{{DayOfWeek.Thursday.name(),DayOfWeek.Friday.name()},{"walk","sleep"}});
        Human father=new Human("Viko", "Karleone",new String[][]{{DayOfWeek.Friday.name(),DayOfWeek.Saturday.name()},{"rest","sleep"}});
        System.out.println(human.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        for (int i = 0; i <100 ; i++) {
            new Human();
            System.gc();
        }
        Family family=new Family(mother, father, new Human[]{human});
        family.addChild(human);
        System.out.println(family.deleteChild(0));
        System.out.println(family.countFamily());
    }
}
