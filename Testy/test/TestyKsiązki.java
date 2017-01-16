
import KsiazkaAdresowa.Osoba;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows
 */
public class TestyKsiązki {
    @Test
    public void TestyKsiązkiWpis() {
        List<Osoba> osoby = new ArrayList<Osoba>();
        osoby.add(0,new Osoba("Przemek","Jarosz","Lwowska","Olkusz",505678908,"34-678"));
        String przewidywanyWpis = "[Przemek Jarosz 505678908 Lwowska Olkusz 34-678]";
            assertEquals("Wpis",przewidywanyWpis,osoby.toString());
    }
    @Test
    public void TestyKsiązkiNiePusta() {
        List<Osoba> osoby = new ArrayList<Osoba>();
        osoby.add(0,new Osoba("Przemek","Jarosz","Lwowska","Olkusz",505678908,"34-678"));
        assertNotNull("Nie pusty",osoby);
    }
    @Test
    public void TestyKsiązkiPusta() {
        List<Osoba> osoby = new ArrayList<Osoba>();
        osoby.add(0,new Osoba("Przemek","Jarosz","Lwowska","Olkusz",505678908,"34-678"));
        osoby.clear();
        boolean przewidywane = true;
        assertEquals("Pusty",przewidywane,osoby.isEmpty());
    }
}