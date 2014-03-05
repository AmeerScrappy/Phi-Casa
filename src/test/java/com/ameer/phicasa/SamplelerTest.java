/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.Sampleler;
import junit.framework.Assert;
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
public class SamplelerTest {
    
    private static Sampleler createSample;
    private static Sampleler updateSample;
    
    public SamplelerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateSampleler() {
        Assert.assertEquals(createSample.getEmpID(), "SMPL8520");
    }
    
    @Test
    public void UpdateSampleler(){
        Assert.assertEquals(updateSample.getEmpName(), "Scrappy");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        createSample = new Sampleler.Builder("8520").empName("Ameer").build();
        updateSample = new Sampleler.Builder("8520").empName("Scrappy").build();
        
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
