package com.nttdata.bank.bootcoin.mapper;

import com.nttdata.bank.bootcoin.model.Currency;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CurrencyMapper implements EntityMapper<Currency, com.nttdata.bank.bootcoin.domain.Currency>{
    @Override
    public com.nttdata.bank.bootcoin.domain.Currency toDomain(Currency model) {
        com.nttdata.bank.bootcoin.domain.Currency domain = new com.nttdata.bank.bootcoin.domain.Currency();
        BeanUtils.copyProperties(model, domain);
        return domain;
    }

    @Override
    public Currency toModel(com.nttdata.bank.bootcoin.domain.Currency domain) {
        Currency model = new Currency();
        BeanUtils.copyProperties(domain, model);
        return model;
    }
}
