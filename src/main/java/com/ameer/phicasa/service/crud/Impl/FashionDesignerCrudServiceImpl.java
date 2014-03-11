/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.employees.FashionDesigner;
import com.ameer.phicasa.service.crud.FashionDesignerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class FashionDesignerCrudServiceImpl implements FashionDesignerCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public FashionDesigner find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public FashionDesigner persist(FashionDesigner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public FashionDesigner merge(FashionDesigner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public FashionDesigner remove(FashionDesigner entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<FashionDesigner> findAll() {
        return null;
    }
}
