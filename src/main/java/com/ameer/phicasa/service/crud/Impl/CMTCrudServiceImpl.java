/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.employees.CMT;
import com.ameer.phicasa.service.crud.CMTCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class CMTCrudServiceImpl implements CMTCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CMT find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CMT persist(CMT entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CMT merge(CMT entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CMT remove(CMT entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CMT> findAll() {
        return null;
    }
}
