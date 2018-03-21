package com.lab.microservices.limitservice.controller;


import com.lab.microservices.limitservice.bean.LimitConfiguration;
import com.lab.microservices.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        return new LimitConfiguration(
                configuration.getMinimum(),
                configuration.getMaximum());
    }
}
