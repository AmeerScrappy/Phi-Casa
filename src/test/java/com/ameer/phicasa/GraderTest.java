/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa;

import com.ameer.phicasa.model.employees.Grader;
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
    //
    @Test
    public void createGreader() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        createGrader = new Grader.Builder("")
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
