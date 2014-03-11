/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Blouse;
import com.ameer.phicasa.service.crud.BlouseCrudService;
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
public class BlouseTestCrudService {
    
    @Mock
    BlouseCrudService crudService;
    public BlouseTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        Blouse createBlouse = new Blouse.Builder("11").build();
        Blouse returnQuestion = crudService.persist(createBlouse);
        when(crudService.persist(createBlouse)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createBlouse);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Blouse testBlouse = new Blouse.Builder("11").build();
        Blouse returnQuestion = crudService.find(testBlouse.getGarmentID());
        when(crudService.find(testBlouse.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testBlouse.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        /*// THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Question q1 = new Question.Builder("What is Java").id("1").build();

        Question returnQuestion = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(q1);*/
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Blouse deleteBlouse = new Blouse.Builder("11").build();
        Blouse returnQuestion = crudService.remove(deleteBlouse);
        when(crudService.remove(deleteBlouse)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteBlouse);
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
        crudService = Mockito.mock(BlouseCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
