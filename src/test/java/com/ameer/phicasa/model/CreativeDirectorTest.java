/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model;

import com.ameer.phicasa.model.employees.CreativeDirector;
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
public class CreativeDirectorTest {
    
    public static CreativeDirector createCreativeDirector;
    public static CreativeDirector updateCreativeDirector;
    
    public CreativeDirectorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createCreativeDirector() {
        
        Assert.assertEquals(createCreativeDirector.getEmpSurname(), "Grey");
    }
    
    @Test
    public void updateCreativeDirector(){
        
        Assert.assertEquals(updateCreativeDirector.getEmpSurname(), "White");        
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createCreativeDirector = new CreativeDirector.Builder("4956").empName("Lady").empSurname("Grey").build();
        updateCreativeDirector = new CreativeDirector.Builder("4956").empName("Lady").empSurname("White").build();
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
