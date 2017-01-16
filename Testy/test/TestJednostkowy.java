
import Test.Rownanie.RownanieKwadratowe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Windows
 */
public class TestJednostkowy {
    @Test
    public void Delta(){
        System.out.println("Delta");
        double delta;
        double przewidywanaDelta = 13.0;
        RownanieKwadratowe rk = new RownanieKwadratowe();
        delta = rk.Delta(3, 5, 1);
        assertEquals("Delta",przewidywanaDelta,delta,0.0);
        
        
    }
    @Test
    public void Pierwiaski(){
        System.out.println("Pierwiastki");
        double x1;
        double x2;
        double przewidywaneX1 = -1.434258545910665; 
        double przewidywaneX2 = -0.2324081207560018;
        RownanieKwadratowe rk = new RownanieKwadratowe();
        rk.Pierwiastki(13, 3, 5);
        x1 = rk.getX1();
        x2 = rk.getX2();
        assertEquals("X1",przewidywaneX1,x1,0.0);
        assertEquals("X2",przewidywaneX2,x2,0.0);        
        
                
    }
    
}
