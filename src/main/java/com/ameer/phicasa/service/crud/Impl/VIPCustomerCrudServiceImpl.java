/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.service.crud.Impl;

import com.ameer.phicasa.model.customers.VIPCustomer;
import com.ameer.phicasa.service.crud.VIPCustomerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class VIPCustomerCrudServiceImpl implements VIPCustomerCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public VIPCustomer find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public VIPCustomer persist(VIPCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public VIPCustomer merge(VIPCustomer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public VIPCustomer remove(VIPCustomer entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<VIPCustomer> findAll() {
        return null;
    }
    
}
