/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.customers.VIPCustomer;
import com.ameer.phicasa.service.crud.VIPCustomerCrudService;
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
public class VIPCustomerTestCrudService {
    
    public static VIPCustomer createVIPCustomer;
    @Mock
    VIPCustomerCrudService crudService;
    public VIPCustomerTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createVIPCustomer = new VIPCustomer.Builder("11").build();
        VIPCustomer returnQuestion = crudService.persist(createVIPCustomer);
        when(crudService.persist(createVIPCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createVIPCustomer);
    }
    
    @Test
    public void testRead() throws Exception{
        
        VIPCustomer testVIPCustomer = new VIPCustomer.Builder("11").build();
        VIPCustomer returnQuestion = crudService.find(testVIPCustomer.getCusID());
        when(crudService.find(testVIPCustomer.getCusID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testVIPCustomer.getCusID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        VIPCustomer deleteVIPCustomer = new VIPCustomer.Builder("11").build();
        
        VIPCustomer returnQuestion = crudService.merge(deleteVIPCustomer);
        when(crudService.merge(deleteVIPCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteVIPCustomer);
        
        returnQuestion = crudService.remove(deleteVIPCustomer);
        when(crudService.remove(deleteVIPCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteVIPCustomer);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        VIPCustomer deleteVIPCustomer = new VIPCustomer.Builder("11").build();
        VIPCustomer returnQuestion = crudService.remove(deleteVIPCustomer);
        when(crudService.remove(deleteVIPCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteVIPCustomer);
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
        crudService = Mockito.mock(VIPCustomerCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
