import com.mdweb.verzamelapp.Bierdopje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BierdopjeTest {
    
    List<Bierdopje> lijst;
    
    @Before
    public void setUp() {
        lijst = new ArrayList<>();
    }
    
    @Test
    public void testSorteer() {
        Bierdopje b1 = new Bierdopje("Jupiler");
        Bierdopje b2 = new Bierdopje("Heineken");
        Bierdopje b3 = new Bierdopje("Kwak");
        Bierdopje b4 = new Bierdopje("Hertog Jan");
        Bierdopje b5 = new Bierdopje("Leffe");
        
        lijst.add(b1);
        lijst.add(b2);
        lijst.add(b3);
        lijst.add(b4);
        lijst.add(b5);
        
        Collections.sort(lijst);
        
        assertEquals(b2,lijst.get(0));
        assertEquals(b4,lijst.get(1));
    }
    
}