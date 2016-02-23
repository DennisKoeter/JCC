package com.mdweb.verzamelapp.comparer;

import com.mdweb.verzamelapp.Postzegel;
import java.util.Comparator;

public class PostzegelComparator implements Comparator<Postzegel>{

    @Override
    public int compare(Postzegel o1, Postzegel o2) {
        return o1.getLengteBreedte().compareTo(((Postzegel)o2).getLengteBreedte());
    }
    
}
