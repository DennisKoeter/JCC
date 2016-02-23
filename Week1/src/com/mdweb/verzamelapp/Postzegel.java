package com.mdweb.verzamelapp;

public class Postzegel extends Voorwerp implements Comparable{
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
    
    public Integer getLengteBreedte() {
        return lengteInMillimeter * breedteInMillimeter;
    }

    @Override
    public int compareTo(Object o) {
        return this.getLengteBreedte().compareTo(((Postzegel)o).getLengteBreedte());
    }
    
    
}
