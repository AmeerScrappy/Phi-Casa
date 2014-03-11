/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.employees.CreativeDirector;
import com.ameer.phicasa.service.crud.CreativeDirectorCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class CreativeDirectorCrudServiceImpl implements CreativeDirectorCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CreativeDirector find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CreativeDirector persist(CreativeDirector entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CreativeDirector merge(CreativeDirector entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CreativeDirector remove(CreativeDirector entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CreativeDirector> findAll() {
        return null;
    }
    
}
