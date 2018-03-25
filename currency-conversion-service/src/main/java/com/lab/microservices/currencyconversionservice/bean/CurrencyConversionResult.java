package com.lab.microservices.currencyconversionservice.bean;


import java.math.BigDecimal;

public class CurrencyConversionResult {

    private Long id;
    private String from;
    private String to;
    private BigDecimal convsersionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyConversionResult(){}

    public CurrencyConversionResult(Long id, String from, String to, BigDecimal convsersionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convsersionMultiple = convsersionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public int getPort() {
        return port;
    }
}
