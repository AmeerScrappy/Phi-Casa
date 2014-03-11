/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.service.crud.BlouseCrudService;
import com.ameer.phicasa.model.garment.Blouse;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class BlouseCrudServiceImpl implements BlouseCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Blouse find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Blouse persist(Blouse entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Blouse merge(Blouse entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Blouse remove(Blouse entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Blouse> findAll() {
        return null;
    }
    
}
