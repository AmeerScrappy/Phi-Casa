/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.garment.Knits;
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
public class KnitsTest {
    
    private static Knits createKnits;
    private static Knits updateKnits;
    
    public KnitsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createDress() {
    
        Assert.assertEquals(createKnits.getGarmentID(), "KNI3211");
    }
    
    @Test
    public void updateDress(){
        
        Assert.assertEquals(updateKnits.getGarmentID(), "KNI78987789");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createKnits = new Knits.Builder("3211").build();
        updateKnits = new Knits.Builder("78987789").build();
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
