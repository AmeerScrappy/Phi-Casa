/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Shirt;
import com.ameer.phicasa.service.crud.ShirtCrudService;
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
public class ShirtTestCrudService {
    
    public static Shirt createShirt;
    @Mock
    ShirtCrudService crudService;
    public ShirtTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createShirt = new Shirt.Builder("11").build();
        Shirt returnQuestion = crudService.persist(createShirt);
        when(crudService.persist(createShirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createShirt);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Shirt testShirt = new Shirt.Builder("11").build();
        Shirt returnQuestion = crudService.find(testShirt.getGarmentID());
        when(crudService.find(testShirt.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testShirt.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Shirt deleteShirt = new Shirt.Builder("11").build();
        
        Shirt returnQuestion = crudService.merge(deleteShirt);
        when(crudService.merge(deleteShirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteShirt);
        
        returnQuestion = crudService.remove(deleteShirt);
        when(crudService.remove(deleteShirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteShirt);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Shirt deleteShirt = new Shirt.Builder("11").build();
        Shirt returnQuestion = crudService.remove(deleteShirt);
        when(crudService.remove(deleteShirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteShirt);
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
        crudService = Mockito.mock(ShirtCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
