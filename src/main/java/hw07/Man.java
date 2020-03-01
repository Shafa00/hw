package hw07;

public class Man extends Human {
    public Man(String Name, String Surname, int Year, int IQ, Human Mother, Human Father) {
        super(Name, Surname, Year, IQ, Mother, Father);
    }

    String species=Species.UNKNOWN.name();
    @Override
    public void greetPet() {
        System.out.printf("Hello %s\n",species);
    }

    public void makeUp(){
        System.out.println("She needs makeUp\n");
    }

}
