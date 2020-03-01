package hw07;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age) {
        super(nickname, age);
    }
    public RoboCat(){}

    @Override
    public void foul() {
        System.out.println("none");
    }

    @Override
    public void eat() {
        System.out.println("none");
    }

    @Override
    public void respond() {
        System.out.println("robotic sounds");
    }
}

