/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.garment.Skirt;
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
public class SkirtTest {
    
    private static Skirt createPants;
    private static Skirt updatePants;
    
    public SkirtTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createBlouse() {
        
        Assert.assertEquals(createPants.getGarmentID(), "SKI3211");
    }
    
    @Test
    public void updateBlouse(){
        
        Assert.assertEquals(updatePants.getGarmentID(), "SKI78987789");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createPants = new Skirt.Builder("3211").build();
        updatePants = new Skirt.Builder("78987789").build();
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
