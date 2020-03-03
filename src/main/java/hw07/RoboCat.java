package hw07;

public class RoboCat extends Pet {
    public RoboCat(String nickname,Species species, int age) {
        super(nickname,species, age);
    }
    public RoboCat(){this.species=Species.RoboCat;}

    @Override
    public void foul() {
        System.out.println("none");
    }

    @Override
    public void respond() {
        System.out.println("robotic sounds");
    }
}

