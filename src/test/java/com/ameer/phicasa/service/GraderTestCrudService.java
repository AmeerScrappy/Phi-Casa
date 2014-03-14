/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.Grader;
import com.ameer.phicasa.service.crud.GraderCrudService;
import org.jmock.auto.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class GraderTestCrudService {
    
    public static Grader createGrader;
    @Mock
    GraderCrudService crudService;
    public GraderTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createGrader = new Grader.Builder("11").build();
        Grader returnQuestion = crudService.persist(createGrader);
        when(crudService.persist(createGrader)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createGrader);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Grader testGrader = new Grader.Builder("11").build();
        Grader returnQuestion = crudService.find(testGrader.getEmpID());
        when(crudService.find(testGrader.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testGrader.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Grader updateGrader = new Grader.Builder("11").build();
        Grader returnQuestion = crudService.merge(updateGrader);
        when(crudService.merge(updateGrader)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateGrader);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Grader deleteGrader = new Grader.Builder("11").build();
        Grader returnQuestion = crudService.remove(deleteGrader);
        when(crudService.remove(deleteGrader)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteGrader);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(GraderCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
