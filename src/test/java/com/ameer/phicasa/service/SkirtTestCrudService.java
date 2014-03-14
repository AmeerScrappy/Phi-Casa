/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.garment.Skirt;
import com.ameer.phicasa.service.crud.SkirtCrudService;
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
public class SkirtTestCrudService {
    
    public static Skirt createSkirt;
    @Mock
    SkirtCrudService crudService;
    public SkirtTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createSkirt = new Skirt.Builder("11").build();
        Skirt returnQuestion = crudService.persist(createSkirt);
        when(crudService.persist(createSkirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createSkirt);
    }
    
    @Test
    public void testRead() throws Exception{
        
        Skirt testSkirt = new Skirt.Builder("11").build();
        Skirt returnQuestion = crudService.find(testSkirt.getGarmentID());
        when(crudService.find(testSkirt.getGarmentID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testSkirt.getGarmentID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Skirt updateSkirt = new Skirt.Builder("11").build();
        Skirt returnQuestion = crudService.merge(updateSkirt);
        when(crudService.merge(updateSkirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateSkirt);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Skirt deleteSkirt = new Skirt.Builder("11").build();
        Skirt returnQuestion = crudService.remove(deleteSkirt);
        when(crudService.remove(deleteSkirt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteSkirt);
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
        crudService = Mockito.mock(SkirtCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
