/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.CMT;
import com.ameer.phicasa.service.crud.CMTCrudService;
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
public class CMTTestCrudService {
    
    public static CMT createCMT;
    @Mock
    CMTCrudService crudService;
    public CMTTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createCMT = new CMT.Builder("11").build();
        CMT returnQuestion = crudService.persist(createCMT);
        when(crudService.persist(createCMT)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createCMT);
    }
    
    @Test
    public void testRead() throws Exception{
        
        CMT testCMT = new CMT.Builder("11").build();
        CMT returnQuestion = crudService.find(testCMT.getEmpID());
        when(crudService.find(testCMT.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testCMT.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        CMT updateCMT = new CMT.Builder("11").build();
        CMT returnQuestion = crudService.merge(updateCMT);
        when(crudService.merge(updateCMT)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateCMT);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        CMT deleteCMT = new CMT.Builder("11").build();
        CMT returnQuestion = crudService.remove(deleteCMT);
        when(crudService.remove(deleteCMT)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteCMT);
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
        crudService = Mockito.mock(CMTCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
