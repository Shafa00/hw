package hw07;

public final class Man extends Human {
    public Man(String name, String surname, int year, int iq, String[][] schedule, Human mother, Human father) {
        super(name, surname, year, iq, schedule, mother, father);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello pet");
    }

    public void makeUp(){
        System.out.println("She needs makeUp\n");
    }

}
