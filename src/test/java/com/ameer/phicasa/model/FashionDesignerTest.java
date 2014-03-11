/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.employees.FashionDesigner;
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
public class FashionDesignerTest {
    
    private static FashionDesigner createFashionDesigner;
    private static FashionDesigner updateFashionDesigner;
    
    public FashionDesignerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createFashionDesigner() {
        
        Assert.assertEquals(createFashionDesigner.getEmpName(), "Jackie");
    }
    
    @Test
    public void updateFashionDesigner(){
        
        Assert.assertEquals(updateFashionDesigner.getEmpName(), "Blake");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createFashionDesigner = new FashionDesigner.Builder("3369").empName("Jackie").build();
        updateFashionDesigner = new FashionDesigner.Builder("3369").empName("Blake").build();
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
