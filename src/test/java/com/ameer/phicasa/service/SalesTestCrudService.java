/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.SalesTeam;
import com.ameer.phicasa.service.crud.SalesCrudService;
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
public class SalesTestCrudService {
    
    public static SalesTeam createSalesTeam;
    @Mock
    SalesCrudService crudService;
    public SalesTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createSalesTeam = new SalesTeam.Builder("11").build();
        SalesTeam returnQuestion = crudService.persist(createSalesTeam);
        when(crudService.persist(createSalesTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createSalesTeam);
    }
    
    @Test
    public void testRead() throws Exception{
        
        SalesTeam testSalesTeam = new SalesTeam.Builder("11").build();
        SalesTeam returnQuestion = crudService.find(testSalesTeam.getEmpID());
        when(crudService.find(testSalesTeam.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testSalesTeam.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        SalesTeam deleteSalesTeam = new SalesTeam.Builder("11").build();
        
        SalesTeam returnQuestion = crudService.merge(deleteSalesTeam);
        when(crudService.merge(deleteSalesTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteSalesTeam);
        
        returnQuestion = crudService.remove(deleteSalesTeam);
        when(crudService.remove(deleteSalesTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteSalesTeam);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        SalesTeam deleteSalesTeam = new SalesTeam.Builder("11").build();
        SalesTeam returnQuestion = crudService.remove(deleteSalesTeam);
        when(crudService.remove(deleteSalesTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteSalesTeam);
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
        crudService = Mockito.mock(SalesCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
