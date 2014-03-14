/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Underware;
import com.ameer.phicasa.service.crud.UnderwareCrudService;
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
public class UnderwareTestCrudService {
    
    public static Underware createUnderware;
    @Mock
    UnderwareCrudService crudService;
    public UnderwareTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createUnderware = new Underware.Builder("11").build();
        Underware returnQuestion = crudService.persist(createUnderware);
        when(crudService.persist(createUnderware)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createUnderware);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Underware testUnderware = new Underware.Builder("11").build();
        Underware returnQuestion = crudService.find(testUnderware.getGarmentID());
        when(crudService.find(testUnderware.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testUnderware.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Underware updateUnderware = new Underware.Builder("11").build();
        Underware returnQuestion = crudService.merge(updateUnderware);
        when(crudService.merge(updateUnderware)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateUnderware);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Underware deleteUnderware = new Underware.Builder("11").build();
        Underware returnQuestion = crudService.remove(deleteUnderware);
        when(crudService.remove(deleteUnderware)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteUnderware);
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
        crudService = Mockito.mock(UnderwareCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
