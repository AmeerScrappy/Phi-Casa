/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.customers.VIPCustomer;
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
public class VIPCustomerTest {
    
    public static VIPCustomer createVIPCustomer;
    public static VIPCustomer updateVIPCustomer;
    
    public VIPCustomerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void createVIPCustomer() {
    
        Assert.assertEquals(createVIPCustomer.getCusName(), "Error");
    }
    
    @Test
    public void updateVIPCustomer(){
        
        Assert.assertEquals(updateVIPCustomer.getCusName(), "404");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createVIPCustomer = new VIPCustomer.Builder("465").empName("Error").build();
        updateVIPCustomer = new VIPCustomer.Builder("465").empName("404").build();
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
