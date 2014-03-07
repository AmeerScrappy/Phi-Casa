/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.PatternMaker;
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
public class PatternMakerTest {
    
    private static PatternMaker createPatternMaker;
    private static PatternMaker updatePatternMaker;
    public PatternMakerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createPatternMaker() {
    
        Assert.assertEquals(createPatternMaker.getPanelNumber(), 12);
    }
    
    @Test
    public void updatePatternMaker(){
        
        Assert.assertEquals(updatePatternMaker.getPanelNumber(), 32);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createPatternMaker = new PatternMaker.Builder("01235").PanelNumber(12).build();
        updatePatternMaker = new PatternMaker.Builder("01235").PanelNumber(32).build();
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
