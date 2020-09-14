package com.training.microservice.controller;

import com.training.microservice.configurator.Configurator;
import com.training.microservice.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

    @Autowired
    private Configurator configurator;

    @GetMapping("/limits")
    public Limit getLimit(){
        return new Limit(configurator.getMaximum(),configurator.getMinimum());
    }

}
