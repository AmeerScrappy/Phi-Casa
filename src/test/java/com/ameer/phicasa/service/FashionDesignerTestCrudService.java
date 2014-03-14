/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.FashionDesigner;
import com.ameer.phicasa.service.crud.FashionDesignerCrudService;
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
public class FashionDesignerTestCrudService {
    
   public static FashionDesigner createFashionDesigner;
    @Mock
    FashionDesignerCrudService crudService;
    public FashionDesignerTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createFashionDesigner = new FashionDesigner.Builder("11").build();
        FashionDesigner returnQuestion = crudService.persist(createFashionDesigner);
        when(crudService.persist(createFashionDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createFashionDesigner);
    }
    
    @Test
    public void testRead() throws Exception{
        
        FashionDesigner testFashionDesigner = new FashionDesigner.Builder("11").build();
        FashionDesigner returnQuestion = crudService.find(testFashionDesigner.getEmpID());
        when(crudService.find(testFashionDesigner.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testFashionDesigner.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        FashionDesigner deleteFashionDesigner = new FashionDesigner.Builder("11").build();
        
        FashionDesigner returnQuestion = crudService.merge(deleteFashionDesigner);
        when(crudService.merge(deleteFashionDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteFashionDesigner);
        
        returnQuestion = crudService.remove(deleteFashionDesigner);
        when(crudService.remove(deleteFashionDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteFashionDesigner);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        FashionDesigner deleteFashionDesigner = new FashionDesigner.Builder("11").build();
        FashionDesigner returnQuestion = crudService.remove(deleteFashionDesigner);
        when(crudService.remove(deleteFashionDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteFashionDesigner);
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
        crudService = Mockito.mock(FashionDesignerCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
