package com.lab.microservices.currencyconversionservice.Controller;

import com.lab.microservices.currencyconversionservice.bean.CurrencyConversionResult;
import com.lab.microservices.currencyconversionservice.proxy.CurrencyExchangeServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConverterController {

    Logger logger = LoggerFactory.getLogger(CurrencyConverterController.class);

    @Autowired
    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;


    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionResult convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity){

        CurrencyConversionResult response = currencyExchangeServiceProxy.retrieveExhcangeValue(from, to);

        logger.info("Currency conversion -> {}", response);

        return new CurrencyConversionResult(response.getId(),
                from,
                to,
                response.getConvsersionMultiple(),
                quantity,
                quantity.multiply(response.getConvsersionMultiple()),
                response.getPort());
    }
}
