/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.employees.SalesTeam;
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
public class SalesTest {
    
    private static SalesTeam createSalesTeam;
    private static SalesTeam updateSalesTeam;
    
    public SalesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateSampleler() {
        Assert.assertEquals(createSalesTeam.getEmpID(), "SALE8520");
        Assert.assertEquals(createSalesTeam.getEmpName(), "Ameer");
    }
    
    @Test
    public void UpdateSampleler(){
        Assert.assertEquals(updateSalesTeam.getEmpID(), "SALE8520");
        Assert.assertEquals(updateSalesTeam.getEmpName(), "Scrappy");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        createSalesTeam = new SalesTeam.Builder("8520").empName("Ameer").build();
        updateSalesTeam = new SalesTeam.Builder("8520").empName("Scrappy").build();
        
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
