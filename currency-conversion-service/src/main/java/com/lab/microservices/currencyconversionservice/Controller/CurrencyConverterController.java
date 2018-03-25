package com.lab.microservices.currencyconversionservice.Controller;

import com.lab.microservices.currencyconversionservice.bean.CurrencyConversionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConverterController {


    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionResult convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity){

        Map<String, String> uriVariables =new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to",to);

        ResponseEntity<CurrencyConversionResult> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                CurrencyConversionResult.class,
                uriVariables);

        CurrencyConversionResult response = responseEntity.getBody();

        return new CurrencyConversionResult(response.getId(),
                from,
                to,
                response.getConvsersionMultiple(),
                quantity,
                quantity.multiply(response.getConvsersionMultiple()),
                response.getPort());
    }
}
