/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.Grader;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class GraderTest {
    
    private static Grader createGrader;
    private static Grader updateGrader;
    
    public GraderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void createGreader() {
        Assert.assertEquals(createGrader.getEmpID(), "GRD21212");
        Assert.assertEquals(createGrader.getEmpName(), "Paul");
    }
    
    @Test
    public void updateGrader(){
        Assert.assertEquals(createGrader.getEmpID(), "GRD21212");
        Assert.assertEquals(updateGrader.getEmpName(), "Jack");
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        createGrader = new Grader.Builder("21212").empName("Paul").build();
        updateGrader = new Grader.Builder("21212").empName("Jack").build();
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
