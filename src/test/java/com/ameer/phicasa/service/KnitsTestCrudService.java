/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Knits;
import com.ameer.phicasa.service.crud.KnitsCrudService;
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
public class KnitsTestCrudService {
    
    public static Knits createKnits;
    @Mock
    KnitsCrudService crudService;
    public KnitsTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createKnits = new Knits.Builder("11").build();
        Knits returnQuestion = crudService.persist(createKnits);
        when(crudService.persist(createKnits)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createKnits);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Knits testKnits = new Knits.Builder("11").build();
        Knits returnQuestion = crudService.find(testKnits.getGarmentID());
        when(crudService.find(testKnits.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testKnits.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Knits deleteKnits = new Knits.Builder("11").build();
        
        Knits returnQuestion = crudService.merge(deleteKnits);
        when(crudService.merge(deleteKnits)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteKnits);
        
        returnQuestion = crudService.remove(deleteKnits);
        when(crudService.remove(deleteKnits)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteKnits);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Knits deleteKnits = new Knits.Builder("11").build();
        Knits returnQuestion = crudService.remove(deleteKnits);
        when(crudService.remove(deleteKnits)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteKnits);
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
        crudService = Mockito.mock(KnitsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
