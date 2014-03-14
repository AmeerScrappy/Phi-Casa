/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.garment.Jersey;
import com.ameer.phicasa.service.crud.JerseyCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class JerseyCrudServiceImpl implements JerseyCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Jersey find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Jersey persist(Jersey entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Jersey merge(Jersey entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Jersey remove(Jersey entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Jersey> findAll() {
        return null;
    }

}
