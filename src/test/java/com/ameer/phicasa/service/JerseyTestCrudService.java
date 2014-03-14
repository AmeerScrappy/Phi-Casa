/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Jersey;
import com.ameer.phicasa.service.crud.JerseyCrudService;
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
public class JerseyTestCrudService {
    
    public static Jersey createJersey;
    @Mock
    JerseyCrudService crudService;
    public JerseyTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createJersey = new Jersey.Builder("11").build();
        Jersey returnQuestion = crudService.persist(createJersey);
        when(crudService.persist(createJersey)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createJersey);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Jersey testJersey = new Jersey.Builder("11").build();
        Jersey returnQuestion = crudService.find(testJersey.getGarmentID());
        when(crudService.find(testJersey.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testJersey.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Jersey updateJersey = new Jersey.Builder("11").build();
        Jersey returnQuestion = crudService.merge(updateJersey);
        when(crudService.merge(updateJersey)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateJersey);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Jersey deleteJersey = new Jersey.Builder("11").build();
        Jersey returnQuestion = crudService.remove(deleteJersey);
        when(crudService.remove(deleteJersey)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteJersey);
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
        crudService = Mockito.mock(JerseyCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
