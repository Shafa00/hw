package hw12.entity;

import java.util.HashSet;

public class Pet {
    public Species species;
    public String nickname;
    public int age;
    public int trickLevel;
    public HashSet<String > habits;

    public Pet(Species species, String nickname, int age, int trickLevel, HashSet<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public HashSet<String> getHabits() {
        return habits;
    }

    public String  prettyFormat(){
        return String.format("pet:\n  species: %s \n  nickname: %s\n  age:%d\n  trickLevel: %d\n  habits: %s"
                , getSpecies(), getNickname(), getAge(), getTrickLevel(), getHabits());
    }

    @Override
    public String toString() {
        return "{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", habits=" + habits +
                '}';
    }
}
