
package misc;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José
 */
public class TecladoTest {
    
    public TecladoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLerInteiro() {
        int i = 0;
        try {
            i = Teclado.lerInteiro();
        } catch (IOException ex) {
            Logger.getLogger(TecladoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("i: " + i);
    }
    
}
