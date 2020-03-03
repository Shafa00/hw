package hw07;

public abstract class Pet {
    String nickname;
    int age;
    Species species;
    public Pet(String nickname,Species species,int age){
        this.nickname=nickname;
        this.age=age;
        this.species=species;
    }

    public Pet() {
    }

    public abstract void respond();

    public void eat() {
        System.out.println("Animals eat same things");
    }

    public void foul() {
        System.out.println("Animals need clean up");
    }
}
