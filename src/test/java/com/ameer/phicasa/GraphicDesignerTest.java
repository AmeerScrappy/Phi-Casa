/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.GraphicDesigner;
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
public class GraphicDesignerTest {
    
    private static GraphicDesigner createGraphicDesigner;
    private static GraphicDesigner updateGraphicDesigner;
    public GraphicDesignerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createGraphicDesigner() {
    
        Assert.assertEquals(createGraphicDesigner.CampaignIdea(), "Diamonds");
    }

    @Test
    public void updateGraphicDesigner(){
        
        Assert.assertEquals(updateGraphicDesigner.CampaignIdea(), "Leather");
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createGraphicDesigner = new GraphicDesigner.Builder("78987").empPhoneNum("021657898").CampaignIdea("Diamonds").build();
        updateGraphicDesigner = new GraphicDesigner.Builder("78987").empPhoneNum("021657898").CampaignIdea("Leather").build();
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
