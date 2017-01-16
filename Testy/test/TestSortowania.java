/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Test.Losowe.LosoweLiczby;
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
public class TestSortowania {
    @Test
    public void TestSortowania() {
        long czasPrzewidywany = 1000;
        long czasSortowania;
        LosoweLiczby ll = new LosoweLiczby();
        czasSortowania = ll.LosujLiczby();
        assertEquals("Czas",czasPrzewidywany, czasSortowania,500);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
