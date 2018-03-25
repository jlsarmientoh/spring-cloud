package com.lab.microservices.currencyexchangeservice.controlller;

import com.lab.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.lab.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExhcangeValue(
            @PathVariable String from,
            @PathVariable String to){
        ExchangeValue exchangeValue = this.repository.findByFromAndTo(from, to);
        exchangeValue.setPort(
                Integer.parseInt(this.environment.getProperty("local.server.port"))
        );
        return exchangeValue;
    }

}