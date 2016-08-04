package flightrising.core;

import java.util.*;

public class Dragon {
    private final int id;
    private String name;
    private Breed breed;
    private Gender gender;
    private Colour primaryColour;
    private Colour secondaryColour;
    private Colour tertiaryColour;
    private PrimaryGene primaryGene;
    private SecondaryGene secondaryGene;
    private TertiaryGene tertiaryGene;
    private HashSet<Integer> relatives;

    // public Dragon(int id) {
    //     this.id = id;
    //     name = "Unnamed";
    //     breed = Breed.GUARDIAN;
    //     gender = Gender.FEMALE;
    //     primaryColour = Colour.MAIZE;
    //     secondaryColour = Colour.MAIZE;
    //     tertiaryColour = Colour.MAIZE;
    //     primaryGene = PrimaryGene.BASIC;
    //     secondaryGene = SecondaryGene.BASIC;
    //     tertiaryGene = TertiaryGene.BASIC;
    // }

    public Dragon(int id, String name, Breed breed, Gender gender, Colour primCol, Colour secCol, Colour tertCol, PrimaryGene primGene, SecondaryGene secGene, TertiaryGene tertGene, HashSet<Integer> relatives) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        primaryColour = primCol;
        secondaryColour = secCol;
        tertiaryColour = tertCol;
        primaryGene = primGene;
        secondaryGene = secGene;
        tertiaryGene = tertGene;
        this.relatives = relatives;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public Breed getBreed() {
        return breed;
    }

    // public void setBreed(Breed breed) {
    //     this.breed = breed;
    // }

    public Colour getPrimaryColour() {
        return primaryColour;
    }

    public Colour getSecondaryColour() {
        return secondaryColour;
    }

    public Colour getTertiaryColour() {
        return tertiaryColour;
    }

    public PrimaryGene getPrimaryGene() {
        return primaryGene;
    }

    public SecondaryGene getSecondaryGene() {
        return secondaryGene;
    }

    public TertiaryGene getTertiaryGene() {
        return tertiaryGene;
    }

    public HashSet<Integer> getRelatives() {
        return relatives;
    }

    public void addRelative(int id) {
        relatives.add(id);
    }

    public String toString() {
        String newline = System.getProperty("line.separator");
        String relativeString;

        if (!relatives.isEmpty()) {
            relativeString = relatives.toString();
        } else {
            relativeString = "noone";
        }

        return newline + name + " - " + id + newline +
                breed + newline +
                primaryColour + " / " + primaryGene + newline +
                secondaryColour + " / " + secondaryGene + newline +
                tertiaryColour + " / " + tertiaryGene + newline +
                "Related to: " + relativeString + newline;
    }
}
