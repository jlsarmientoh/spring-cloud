package com.lab.microservices.currencyconversionservice.proxy;

import com.lab.microservices.currencyconversionservice.bean.CurrencyConversionResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionResult retrieveExhcangeValue(
            @PathVariable(name = "from") String from,
            @PathVariable(name = "to") String to);
}
