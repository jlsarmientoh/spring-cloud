package com.lab.microservices.currencyexchangeservice.bean;


import java.math.BigDecimal;

public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private BigDecimal convsersionMultiple;

    public ExchangeValue(Long id, String from, String to, BigDecimal convsersionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convsersionMultiple = convsersionMultiple;
    }

    public ExchangeValue() {
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConvsersionMultiple() {
        return convsersionMultiple;
    }
}
