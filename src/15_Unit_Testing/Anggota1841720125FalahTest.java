package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Anggota1841720125FalahTest extends TestCase {

    Anggota1841720125FalahTest instance;

    public Anggota1841720125FalahTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720125FalahTest("Falah", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchFalah method, of class Anggota1841720125Falah.
     */
    @Test
    public void testSearchFalah() {
        System.out.println("save test");
        this.instance.saveFalah();
        ArrayList<Anggota1841720125FalahTest> expResult = instance.getByNamaAndAlamatAndTeleponFalah(instance.getNamaFalah(), instance.getAlamatFalah(), instance.getTeleponFalah());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveFalah method, of class Anggota1841720125Falah.
     */
    @Test
    public void testSaveFalah() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720125Falah> result = instance.searchFalah(keyword);
        ArrayList<Anggota1841720125Falah> expResult = instance.getByNamaAndAlamatAndTeleponFalah(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
