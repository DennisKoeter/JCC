package com.mdweb.verzamelapp;

public class Postzegel extends Voorwerp{
    private int lengteInMillimeter;
    private int breedteInMillimeter;

    public Postzegel(int lengteInMillimeter, int breedteInMillimeter) {
        this.lengteInMillimeter = lengteInMillimeter;
        this.breedteInMillimeter = breedteInMillimeter;
    }

    public int getLengteInMillimeter() {
        return lengteInMillimeter;
    }

    public int getBreedteInMillimeter() {
        return breedteInMillimeter;
    }
    
    public String getLengteBreedte() {
        return lengteInMillimeter + " " + breedteInMillimeter;
    }
    
    
}
