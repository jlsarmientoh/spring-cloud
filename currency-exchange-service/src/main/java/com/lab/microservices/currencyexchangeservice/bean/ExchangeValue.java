package com.lab.microservices.currencyexchangeservice.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "exchange_value")
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    @Column(name = "conversion_multiple")
    private BigDecimal convsersionMultiple;

    @Column
    private int port;

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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
