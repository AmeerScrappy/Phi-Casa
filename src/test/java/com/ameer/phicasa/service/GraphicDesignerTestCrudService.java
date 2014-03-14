/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.GraphicDesigner;
import com.ameer.phicasa.service.crud.GraphicDesignerCrudService;
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
public class GraphicDesignerTestCrudService {
    
   public static GraphicDesigner createGraphicDesigner;
    @Mock
    GraphicDesignerCrudService crudService;
    public GraphicDesignerTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createGraphicDesigner = new GraphicDesigner.Builder("11").build();
        GraphicDesigner returnQuestion = crudService.persist(createGraphicDesigner);
        when(crudService.persist(createGraphicDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createGraphicDesigner);
    }
    
    @Test
    public void testRead() throws Exception{
        
        GraphicDesigner testGraphicDesigner = new GraphicDesigner.Builder("11").build();
        GraphicDesigner returnQuestion = crudService.find(testGraphicDesigner.getEmpID());
        when(crudService.find(testGraphicDesigner.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testGraphicDesigner.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        GraphicDesigner updateGraphicDesigner = new GraphicDesigner.Builder("11").build();
        GraphicDesigner returnQuestion = crudService.merge(updateGraphicDesigner);
        when(crudService.merge(updateGraphicDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateGraphicDesigner);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        GraphicDesigner deleteGraphicDesigner = new GraphicDesigner.Builder("11").build();
        GraphicDesigner returnQuestion = crudService.remove(deleteGraphicDesigner);
        when(crudService.remove(deleteGraphicDesigner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteGraphicDesigner);
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
        crudService = Mockito.mock(GraphicDesignerCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
