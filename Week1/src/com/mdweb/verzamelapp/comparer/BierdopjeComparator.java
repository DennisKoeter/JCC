package com.mdweb.verzamelapp.comparer;

import com.mdweb.verzamelapp.Bierdopje;
import java.util.Comparator;

public class BierdopjeComparator implements Comparator<Bierdopje> {

    @Override
    public int compare(Bierdopje o1, Bierdopje o2) {
        return o1.getMerk().compareToIgnoreCase(o2.getMerk());
    }
    
}
