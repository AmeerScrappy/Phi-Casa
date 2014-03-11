/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.garment.Pants;
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
public class PantsTest {
    
    private static Pants createPants;
    private static Pants updatePants;
    
    public PantsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createBlouse() {
        
        Assert.assertEquals(createPants.getGarmentID(), "PANT3211");
    }
    
    @Test
    public void updateBlouse(){
        
        Assert.assertEquals(updatePants.getGarmentID(), "PANT78987789");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createPants = new Pants.Builder("3211").build();
        updatePants = new Pants.Builder("78987789").build();
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
