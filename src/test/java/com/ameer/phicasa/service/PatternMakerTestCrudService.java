/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.PatternMaker;
import com.ameer.phicasa.service.crud.PatternMakerCrudService;
import org.jmock.auto.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class PatternMakerTestCrudService {
    
   public static PatternMaker createPatternMaker;
    @Mock
    PatternMakerCrudService crudService;
    public PatternMakerTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createPatternMaker = new PatternMaker.Builder("11").build();
        PatternMaker returnQuestion = crudService.persist(createPatternMaker);
        when(crudService.persist(createPatternMaker)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createPatternMaker);
    }
    
    @Test
    public void testRead() throws Exception{
        
        PatternMaker testPatternMaker = new PatternMaker.Builder("11").build();
        PatternMaker returnQuestion = crudService.find(testPatternMaker.getEmpID());
        when(crudService.find(testPatternMaker.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testPatternMaker.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        PatternMaker deletePatternMaker = new PatternMaker.Builder("11").build();
        
        PatternMaker returnQuestion = crudService.merge(deletePatternMaker);
        when(crudService.merge(deletePatternMaker)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deletePatternMaker);
        
        returnQuestion = crudService.remove(deletePatternMaker);
        when(crudService.remove(deletePatternMaker)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deletePatternMaker);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        PatternMaker deletePatternMaker = new PatternMaker.Builder("11").build();
        PatternMaker returnQuestion = crudService.remove(deletePatternMaker);
        when(crudService.remove(deletePatternMaker)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deletePatternMaker);
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
        crudService = Mockito.mock(PatternMakerCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
