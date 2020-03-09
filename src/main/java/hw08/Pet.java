package hw08;

import java.util.HashSet;

public class Pet {
    protected String  species;
    protected String nickname;
    protected HashSet<String > habits;

    public Pet(String species, String nickname, HashSet<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", habits=" + habits +
                '}';
    }
}
