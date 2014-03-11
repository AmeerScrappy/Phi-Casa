/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.employees.MarketingTeam;
import com.ameer.phicasa.service.crud.MarketingTeamCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class MarketingTeamCrudServiceImpl implements MarketingTeamCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public MarketingTeam find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public MarketingTeam persist(MarketingTeam entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MarketingTeam merge(MarketingTeam entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MarketingTeam remove(MarketingTeam entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MarketingTeam> findAll() {
        return null;
    }
    
}
