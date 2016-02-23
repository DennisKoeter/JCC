package com.mdweb.verzamelapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set {
    private String naam;
    private int jaar;
    private List<Voorwerp> voorwerpen;
    private static int AUTO_INCREMENT = 0;
    private int id;
    
    public int getId() {
        return id;
    }

    public Set(String naam, int jaar) {
        this.naam = naam;
        this.jaar = jaar;
        this.voorwerpen = new ArrayList<>();
        this.id = AUTO_INCREMENT;
        AUTO_INCREMENT++;
    }

    public String getNaam() {
        return naam;
    }

    public int getJaar() {
        return jaar;
    }

    public List<Voorwerp> getVoorwerpen() {
        return Collections.unmodifiableList(voorwerpen);
    }
    
    public void addVoorwerp(Voorwerp voorwerp) {
        voorwerpen.add(voorwerp);
    }
    
    public void removeVoorwerp(Voorwerp voorwerp) {
        voorwerpen.remove(voorwerp);
    }
    
}
