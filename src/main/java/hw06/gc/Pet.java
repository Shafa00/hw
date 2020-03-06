package hw06.gc;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    protected Species species;
    protected String nickname;

    public Pet(){}

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pet object removed");
    }
}
