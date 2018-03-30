package com.lab.microservices.currencyconversionservice.proxy;

import com.lab.microservices.currencyconversionservice.bean.CurrencyConversionResult;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "netflix-zuul-api-getway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionResult retrieveExhcangeValue(
            @PathVariable(name = "from") String from,
            @PathVariable(name = "to") String to);
}
