/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Pants;
import com.ameer.phicasa.service.crud.PantsCrudService;
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
public class PantsTestCrudService {
    
    public static Pants createPants;
    @Mock
    PantsCrudService crudService;
    public PantsTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createPants = new Pants.Builder("11").build();
        Pants returnQuestion = crudService.persist(createPants);
        when(crudService.persist(createPants)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createPants);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Pants testPants = new Pants.Builder("11").build();
        Pants returnQuestion = crudService.find(testPants.getGarmentID());
        when(crudService.find(testPants.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testPants.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Pants deletePants = new Pants.Builder("11").build();
        
        Pants returnQuestion = crudService.merge(deletePants);
        when(crudService.merge(deletePants)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deletePants);
        
        returnQuestion = crudService.remove(deletePants);
        when(crudService.remove(deletePants)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deletePants);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Pants deletePants = new Pants.Builder("11").build();
        Pants returnQuestion = crudService.remove(deletePants);
        when(crudService.remove(deletePants)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deletePants);
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
        crudService = Mockito.mock(PantsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
