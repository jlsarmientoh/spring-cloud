package com.lab.microservices.currencyexchangeservice.repository;


import com.lab.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

    ExchangeValue findByFromAndTo(String from, String to);
}
