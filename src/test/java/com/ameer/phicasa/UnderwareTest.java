/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.garment.Underware;
import org.testng.Assert;
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
public class UnderwareTest {
    
    private static Underware createUnderware;
    private static Underware updateUnderware;
    
    public UnderwareTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createDress() {
    
        Assert.assertEquals(createUnderware.getGarmentID(), "UDW3211");
    }
    
    @Test
    public void updateDress(){
        
        Assert.assertEquals(updateUnderware.getGarmentID(), "UDW78987789");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createUnderware = new Underware.Builder("3211").build();
        updateUnderware = new Underware.Builder("78987789").build();
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
