/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdweb.verzamelapp.comparer;

import com.mdweb.verzamelapp.Bierdopje;
import java.util.Comparator;

/**
 *
 * @author sword
 */
public class BierdopjeComparator implements Comparator<Bierdopje> {

    @Override
    public int compare(Bierdopje o1, Bierdopje o2) {
        return o1.getMerk().compareToIgnoreCase(o2.getMerk());
    }
    
}
