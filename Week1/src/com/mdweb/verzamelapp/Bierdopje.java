package com.mdweb.verzamelapp;

public class Bierdopje extends Voorwerp implements Comparable {
    private String merk;

    public Bierdopje(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    @Override
    public int compareTo(Object o) {
        return this.getMerk().compareToIgnoreCase(((Bierdopje)o).getMerk());
    }
    
}
