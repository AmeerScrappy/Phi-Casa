/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.config;

import com.ameer.phicasa.service.crud.BlouseCrudService;
import com.ameer.phicasa.service.crud.Impl.BlouseCrudServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author student
 */
@Configurable
public class AppConfig {    
    @Bean(name = "questionCrudService")
    public  BlouseCrudService getQuestionCrudService(){
        return new BlouseCrudServiceImpl();
    }
}
