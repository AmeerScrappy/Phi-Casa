/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.CreativeDirector;
import com.ameer.phicasa.service.crud.CreativeDirectorCrudService;
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
public class CreativeDirectorTestCrudService {
    
    public static CreativeDirector createCreativeDirector;
    @Mock
    CreativeDirectorCrudService crudService;
    public CreativeDirectorTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createCreativeDirector = new CreativeDirector.Builder("11").build();
        CreativeDirector returnQuestion = crudService.persist(createCreativeDirector);
        when(crudService.persist(createCreativeDirector)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createCreativeDirector);
    }
    
    @Test
    public void testRead() throws Exception{
        
        CreativeDirector testdeleteCreativeDirector = new CreativeDirector.Builder("11").build();
        CreativeDirector returnQuestion = crudService.find(testdeleteCreativeDirector.getEmpID());
        when(crudService.find(testdeleteCreativeDirector.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testdeleteCreativeDirector.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        CreativeDirector deleteCreativeDirector = new CreativeDirector.Builder("11").build();
        
        CreativeDirector returnQuestion = crudService.merge(deleteCreativeDirector);
        when(crudService.merge(deleteCreativeDirector)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteCreativeDirector);
        
        returnQuestion = crudService.remove(deleteCreativeDirector);
        when(crudService.remove(deleteCreativeDirector)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteCreativeDirector);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        CreativeDirector deleteCreativeDirector = new CreativeDirector.Builder("11").build();
        CreativeDirector returnQuestion = crudService.remove(deleteCreativeDirector);
        when(crudService.remove(deleteCreativeDirector)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteCreativeDirector);
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
        crudService = Mockito.mock(CreativeDirectorCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
