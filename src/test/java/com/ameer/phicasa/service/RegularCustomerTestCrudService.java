/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.customers.RegularCustomer;
import com.ameer.phicasa.service.crud.RegularCustomerCrudService;
import org.jmock.auto.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class RegularCustomerTestCrudService {
    
    public static RegularCustomer createRegularCustomer;
    @Mock
    RegularCustomerCrudService crudService;
    public RegularCustomerTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createRegularCustomer = new RegularCustomer.Builder("11").build();
        RegularCustomer returnQuestion = crudService.persist(createRegularCustomer);
        when(crudService.persist(createRegularCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createRegularCustomer);
    }
    
    @Test
    public void testRead() throws Exception{
        
        RegularCustomer testRegularCustomer = new RegularCustomer.Builder("11").build();
        RegularCustomer returnQuestion = crudService.find(testRegularCustomer.getCusID());
        when(crudService.find(testRegularCustomer.getCusID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testRegularCustomer.getCusID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        RegularCustomer deleteRegularCustomer = new RegularCustomer.Builder("11").build();
        
        RegularCustomer returnQuestion = crudService.merge(deleteRegularCustomer);
        when(crudService.merge(deleteRegularCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteRegularCustomer);
        
        returnQuestion = crudService.remove(deleteRegularCustomer);
        when(crudService.remove(deleteRegularCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteRegularCustomer);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        RegularCustomer deleteRegularCustomer = new RegularCustomer.Builder("11").build();
        RegularCustomer returnQuestion = crudService.remove(deleteRegularCustomer);
        when(crudService.remove(deleteRegularCustomer)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteRegularCustomer);
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
        crudService = Mockito.mock(RegularCustomerCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
