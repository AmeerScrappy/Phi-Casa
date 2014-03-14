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
    public static Blouse createBlouse;
    @Mock
    BlouseCrudService crudService;
    public BlouseTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createBlouse = new Blouse.Builder("11").build();
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
        
        Blouse deleteBlouse = new Blouse.Builder("11").build();
        
        Blouse returnQuestion = crudService.merge(deleteBlouse);
        when(crudService.merge(deleteBlouse)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteBlouse);
        
        returnQuestion = crudService.remove(deleteBlouse);
        when(crudService.remove(deleteBlouse)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteBlouse);
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
