/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.employees.DistributionTeam;
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
public class DistributionTeamTest {
    
    private static DistributionTeam createDistributionTeam;
    private static DistributionTeam updateDistributionTeam;
    
    public DistributionTeamTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createDistributionTeam() {
        
        Assert.assertEquals(createDistributionTeam.getDeliveryAddress(), "Nowwhere");
    }
    
    @Test
    public void updateDistributionTeam(){
        
        Assert.assertEquals(updateDistributionTeam.getDeliveryAddress(), "Somewhere");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        createDistributionTeam = new DistributionTeam.Builder("789").DeliveryAddress("Nowwhere").build();
        updateDistributionTeam = new DistributionTeam.Builder("789").DeliveryAddress("Somewhere").build();
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
