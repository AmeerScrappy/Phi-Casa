/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;


import com.ameer.phicasa.model.garment.Dress;
import com.ameer.phicasa.service.crud.DressCrudService;
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
public class DressTestCrudService {
    
   public static Dress createDress;
    @Mock
    DressCrudService crudService;
    public DressTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createDress = new Dress.Builder("11").build();
        Dress returnQuestion = crudService.persist(createDress);
        when(crudService.persist(createDress)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createDress);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Dress testDress = new Dress.Builder("11").build();
        Dress returnQuestion = crudService.find(testDress.getGarmentID());
        when(crudService.find(testDress.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testDress.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Dress deleteDress = new Dress.Builder("11").build();
        
        Dress returnQuestion = crudService.merge(deleteDress);
        when(crudService.merge(deleteDress)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteDress);
        
        returnQuestion = crudService.remove(deleteDress);
        when(crudService.remove(deleteDress)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteDress);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Dress deleteDress = new Dress.Builder("11").build();
        Dress returnQuestion = crudService.remove(deleteDress);
        when(crudService.remove(deleteDress)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteDress);
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
        crudService = Mockito.mock(DressCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
