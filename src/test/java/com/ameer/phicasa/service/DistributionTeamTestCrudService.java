/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.DistributionTeam;
import com.ameer.phicasa.service.crud.DistributionTeamCrudService;
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
public class DistributionTeamTestCrudService {
    
   public static DistributionTeam createDistributionTeam;
    @Mock
    DistributionTeamCrudService crudService;
    public DistributionTeamTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createDistributionTeam = new DistributionTeam.Builder("11").build();
        DistributionTeam returnQuestion = crudService.persist(createDistributionTeam);
        when(crudService.persist(createDistributionTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createDistributionTeam);
    }
    
    @Test
    public void testRead() throws Exception{
        
        DistributionTeam testDistributionTeam = new DistributionTeam.Builder("11").build();
        DistributionTeam returnQuestion = crudService.find(testDistributionTeam.getEmpID());
        when(crudService.find(testDistributionTeam.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testDistributionTeam.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        DistributionTeam updateDistributionTeam = new DistributionTeam.Builder("11").build();
        DistributionTeam returnQuestion = crudService.merge(updateDistributionTeam);
        when(crudService.merge(updateDistributionTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateDistributionTeam);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        DistributionTeam deleteDistributionTeam = new DistributionTeam.Builder("11").build();
        DistributionTeam returnQuestion = crudService.remove(deleteDistributionTeam);
        when(crudService.remove(deleteDistributionTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteDistributionTeam);
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
        crudService = Mockito.mock(DistributionTeamCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
