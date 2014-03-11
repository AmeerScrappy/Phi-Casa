/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.employees.PatternMaker;
import com.ameer.phicasa.service.crud.PatternMakerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class PatternMakerCrudServiceImpl implements PatternMakerCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PatternMaker find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PatternMaker persist(PatternMaker entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PatternMaker merge(PatternMaker entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PatternMaker remove(PatternMaker entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PatternMaker> findAll() {
        return null;
    }
}
