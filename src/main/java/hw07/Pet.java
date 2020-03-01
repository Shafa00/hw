package hw07;

public abstract class Pet {
    String nickname;
    int age;
    public Pet(String nickname,int age){
        this.nickname=nickname;
        this.age=age;
    }

    public Pet() {
    }

    public abstract void respond();
    public abstract void eat();
    public abstract void foul();
}
