/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.SalesTeam;
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
public class SalesTest {
    
    private static SalesTeam createSample;
    private static SalesTeam updateSample;
    
    public SalesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateSampleler() {
        Assert.assertEquals(createSample.getEmpID(), "SMPL8520");
        Assert.assertEquals(updateSample.getEmpName(), "Ameer");
    }
    
    @Test
    public void UpdateSampleler(){
        Assert.assertEquals(updateSample.getEmpID(), "SMPL8520");
        Assert.assertEquals(updateSample.getEmpName(), "Scrappy");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        createSample = new SalesTeam.Builder("8520").empName("Ameer").build();
        updateSample = new SalesTeam.Builder("8520").empName("Scrappy").build();
        
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
