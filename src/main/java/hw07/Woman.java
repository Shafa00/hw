package hw07;

public class Woman extends Human {
    public Woman(String Name, String Surname, int Year, int IQ, Human Mother, Human Father) {
        super(Name, Surname, Year, IQ, Mother, Father);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello pet");
    }

    public void repairCar(){
        System.out.println("He repair car");
    }

}
