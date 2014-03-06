/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.CMT;
import com.ameer.phicasa.model.garment.Blouse;
import com.ameer.phicasa.model.garment.Garment;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class CMTTest {
    
    private static CMT createCMT;
    public static Blouse BLS1;
    
    public CMTTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createCMT() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        List<Garment> L = new ArrayList<Garment>();
        BLS1 = new Blouse.Builder("1").garmentColor("Pink").garmentFabric("Cotton").garmentSize("Small").build();
        L.add(BLS1);
        createCMT = new CMT.Builder("33495").getGarmentList(L).build();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
