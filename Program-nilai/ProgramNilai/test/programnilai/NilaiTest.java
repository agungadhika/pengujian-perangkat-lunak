/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programnilai;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agung
 */
public class NilaiTest {
    
    public NilaiTest() {
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

    /**
     * Test of perhitungan method, of class Nilai.
     */
    @Test
    public void testPerhitungan() {
        System.out.println("perhitungan");
        Nilai instance = null;
        int nilai_tugas = 90;
        int nilai_uas = 80;
        int nilai_uts = 70;
        int expResult = 90;
        int result = instance.perhitungan(nilai_tugas,nilai_uas,nilai_uts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNilai method, of class Nilai.
     */
    @Test
    public void testGetNilai() {
        System.out.println("getNilai");
        Nilai instance = null;
        int expResult = 0;
        int result = instance.getNilai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hitungGrade method, of class Nilai.
     */
    @Test
    public void testHitungGrade() {
        System.out.println("hitungGrade");
        Nilai instance = null;
        char expResult = ' ';
        char result = instance.hitungGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
