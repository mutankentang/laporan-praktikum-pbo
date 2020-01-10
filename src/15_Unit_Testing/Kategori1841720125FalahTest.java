package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unittest.database.Kategori1841720125Falah;


public class Kategori1841720125FalahTest extends TestCase {

    Kategori1841720125Falah instance;

    public Kategori1841720125FalahTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720125Falah("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchFalah method, of class Kategori1841720125Falah.
     */
    @Test
    public void testSearchFalah() {
        System.out.println("save test");
        this.instance.saveFalah();
        ArrayList<Kategori1841720125Falah> expResult = instance.getByNamaAndKeteranganFalah(instance.getNamaFalah(), instance.getKeteranganFalah());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveFalah method, of class Kategori1841720125Falah.
     */
    @Test
    public void testSaveFalah() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720125Falah> result = instance.searchFalah(keyword);
        ArrayList<Kategori1841720125Falah> expResult = instance.getByNamaAndKeteranganFalah(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
