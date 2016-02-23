import com.mdweb.verzamelapp.Postzegel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PostzegelTest {
    
    List<Postzegel> lijst;
    
    @Before
    public void setUp() {
        lijst = new ArrayList<>();
    }
    
    @Test
    public void testSorteer() {
        Postzegel b1 = new Postzegel(900,900);
        Postzegel b2 = new Postzegel(700,700);
        Postzegel b3 = new Postzegel(200,300);
        Postzegel b4 = new Postzegel(201,200);
        Postzegel b5 = new Postzegel(300,300);
        Postzegel b6 = new Postzegel(500,500);
        
        lijst.add(b1);
        lijst.add(b2);
        lijst.add(b3);
        lijst.add(b4);
        lijst.add(b5);
        lijst.add(b6);
        
        Collections.sort(lijst);
        
        assertEquals(b4,lijst.get(0));
        assertEquals(b3,lijst.get(1));
        assertEquals(b5,lijst.get(2));
    }
    
}