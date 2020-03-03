package hw07;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, String[][] schedule, Human mother, Human father) {
        super(name, surname, year, iq, schedule, mother, father);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello pet");
    }

    public void repairCar(){
        System.out.println("He repair car");
    }

}
