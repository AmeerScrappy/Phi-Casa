/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service;

import com.ameer.phicasa.model.employees.MarketingTeam;
import com.ameer.phicasa.service.crud.MarketingTeamCrudService;
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
public class MarketingTeamTestCrudService {
    
   public static MarketingTeam createMarketingTeam;
    @Mock
    MarketingTeamCrudService crudService;
    public MarketingTeamTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception{
    
        createMarketingTeam = new MarketingTeam.Builder("11").build();
        MarketingTeam returnQuestion = crudService.persist(createMarketingTeam);
        when(crudService.persist(createMarketingTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(createMarketingTeam);
    }
    
    @Test
    public void testRead() throws Exception{
        
        MarketingTeam testMarketingTeam = new MarketingTeam.Builder("11").build();
        MarketingTeam returnQuestion = crudService.find(testMarketingTeam.getEmpID());
        when(crudService.find(testMarketingTeam.getEmpID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testMarketingTeam.getEmpID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        MarketingTeam updateMarketingTeam = new MarketingTeam.Builder("11").build();
        MarketingTeam returnQuestion = crudService.merge(updateMarketingTeam);
        when(crudService.merge(updateMarketingTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(updateMarketingTeam);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        MarketingTeam deleteMarketingTeam = new MarketingTeam.Builder("11").build();
        MarketingTeam returnQuestion = crudService.remove(deleteMarketingTeam);
        when(crudService.remove(deleteMarketingTeam)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteMarketingTeam);
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
        crudService = Mockito.mock(MarketingTeamCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
