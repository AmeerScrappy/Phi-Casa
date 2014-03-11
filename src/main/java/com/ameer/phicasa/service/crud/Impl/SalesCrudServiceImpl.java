/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.employees.SalesTeam;
import com.ameer.phicasa.service.crud.SalesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class SalesCrudServiceImpl implements SalesCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SalesTeam find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SalesTeam persist(SalesTeam entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SalesTeam merge(SalesTeam entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SalesTeam remove(SalesTeam entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SalesTeam> findAll() {
        return null;
    }
    
}
