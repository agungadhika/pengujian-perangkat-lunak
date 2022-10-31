/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gajifix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ikantongkol
 */
public class GajiFixTest {
    
    public GajiFixTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getGolongan method, of class GajiFix.
     */
    @Test
    public void testGetGolongan() {
        System.out.println("getGolongan");
        GajiFix instance = new GajiFix();
        int expResult = 1;
        instance.setGolongan(1);
        int result = instance.getGolongan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGolongan method, of class GajiFix.
     */

    @Test
    public void testSetGolongan() {
//        System.out.println("getGolongan");
        GajiFix instance = new GajiFix();
        int expResult = 0;
        int result = instance.getGolongan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   
        
    }

    /**
     * Test of getMasa_kerja method, of class GajiFix.
     */
    @Test
    public void testGetMasa_kerja() {
        System.out.println("getMasa_kerja");
        GajiFix instance = new GajiFix();
        int expResult = 0;
        int result = instance.getMasa_kerja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMasa_kerja method, of class GajiFix.
     */
    @Test
    public void testSetMasa_kerja() {
        System.out.println("setMasa_kerja");
        int masa_kerja = 0;
        GajiFix instance = new GajiFix();
        instance.setMasa_kerja(masa_kerja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKehadiran method, of class GajiFix.
     */
    @Test
    public void testGetKehadiran() {
        System.out.println("getKehadiran");
        GajiFix instance = new GajiFix();
        int expResult = 0;
        int result = instance.getKehadiran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKehadiran method, of class GajiFix.
     */
    @Test
    public void testSetKehadiran() {
        System.out.println("setKehadiran");
        int kehadiran = 0;
        GajiFix instance = new GajiFix();
        instance.setKehadiran(kehadiran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJumlah_kehadiran method, of class GajiFix.
     */
    @Test
    public void testGetJumlah_kehadiran() {
        System.out.println("getJumlah_kehadiran");
        GajiFix instance = new GajiFix();
        int expResult = 0;
        int result = instance.getJumlah_kehadiran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJumlah_kehadiran method, of class GajiFix.
     */
    @Test
    public void testSetJumlah_kehadiran() {
        System.out.println("setJumlah_kehadiran");
        int jumlahkehadiran = 0;
        GajiFix instance = new GajiFix();
        instance.setJumlah_kehadiran(jumlahkehadiran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpah method, of class GajiFix.
     */
    @Test
    public void testGetUpah() {
        System.out.println("getUpah");
        GajiFix instance = new GajiFix();
        int expResult = 0;
        int result = instance.getUpah();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpah method, of class GajiFix.
     */
    @Test
    public void testSetUpah() {
        System.out.println("setUpah");
        int upah = 0;
        GajiFix instance = new GajiFix();
        instance.setUpah(upah);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTunjangan method, of class GajiFix.
     */
    @Test
    public void testGetTunjangan() {
        System.out.println("getTunjangan");
        GajiFix instance = new GajiFix();
        int expResult = 0;
        int result = instance.getTunjangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTunjangan method, of class GajiFix.
     */
    @Test
    public void testSetTunjangan() {
        System.out.println("setTunjangan");
        int tunjangan = 0;
        GajiFix instance = new GajiFix();
        instance.setTunjangan(tunjangan);
    }

    /**
     * Test of getTotal method, of class GajiFix.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        GajiFix instance = new GajiFix();
        int expResult = 4210000;
        instance.setGolongan(1);
        instance.setMasa_kerja(6);
        instance.setKehadiran(6);
        int result = instance.getTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTotal method, of class GajiFix.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 0;
        GajiFix instance = new GajiFix();
        instance.setTotal(total);
    }

    /**
     * Test of main method, of class GajiFix.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] argvs = null;
        GajiFix.main(argvs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
