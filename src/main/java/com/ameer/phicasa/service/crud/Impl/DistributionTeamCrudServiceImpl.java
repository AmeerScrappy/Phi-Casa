/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;


import com.ameer.phicasa.model.employees.DistributionTeam;
import com.ameer.phicasa.service.crud.DistributionTeamCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class DistributionTeamCrudServiceImpl implements DistributionTeamCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public DistributionTeam find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public DistributionTeam persist(DistributionTeam entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DistributionTeam merge(DistributionTeam entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public DistributionTeam remove(DistributionTeam entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<DistributionTeam> findAll() {
        return null;
    }
    
}
