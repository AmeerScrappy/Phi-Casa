/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Jacket;
import com.ameer.phicasa.service.crud.JacketCrudService;
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
public class JacketTestCrudService {
    
    public static Jacket createJacket;
    @Mock
    JacketCrudService crudService;
    public JacketTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createJacket = new Jacket.Builder("11").build();
        Jacket returnQuestion = crudService.persist(createJacket);
        when(crudService.persist(createJacket)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createJacket);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Jacket testJacket = new Jacket.Builder("11").build();
        Jacket returnQuestion = crudService.find(testJacket.getGarmentID());
        when(crudService.find(testJacket.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testJacket.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Jacket updateJacket = new Jacket.Builder("11").build();
        Jacket returnQuestion = crudService.merge(updateJacket);
        when(crudService.merge(updateJacket)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateJacket);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Jacket deleteJacket = new Jacket.Builder("11").build();
        Jacket returnQuestion = crudService.remove(deleteJacket);
        when(crudService.remove(deleteJacket)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteJacket);
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
        crudService = Mockito.mock(JacketCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
