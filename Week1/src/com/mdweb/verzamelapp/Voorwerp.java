package com.mdweb.verzamelapp;

public class Voorwerp {
    private static int AUTO_INCREMENT = 0;
    private int id;

    public Voorwerp() {
        this.id = AUTO_INCREMENT;
        AUTO_INCREMENT++;
    }

    public int getId() {
        return id;
    }
    
}