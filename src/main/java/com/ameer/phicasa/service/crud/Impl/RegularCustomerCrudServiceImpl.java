/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.customers.RegularCustomer;
import com.ameer.phicasa.service.crud.RegularCustomerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class RegularCustomerCrudServiceImpl implements RegularCustomerCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public RegularCustomer find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public RegularCustomer persist(RegularCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public RegularCustomer merge(RegularCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public RegularCustomer remove(RegularCustomer entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<RegularCustomer> findAll() {
        return null;
    }
    
}
