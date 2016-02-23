/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdweb.verzamelapp.comparer;

import com.mdweb.verzamelapp.Postzegel;
import java.util.Comparator;

/**
 *
 * @author sword
 */
public class PostzegelComparator implements Comparator<Postzegel>{

    @Override
    public int compare(Postzegel o1, Postzegel o2) {
        return o1.getLengteBreedte().compareToIgnoreCase(o2.getLengteBreedte());
    }
    
}
