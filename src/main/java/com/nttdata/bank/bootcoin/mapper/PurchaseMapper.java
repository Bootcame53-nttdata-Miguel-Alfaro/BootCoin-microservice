package com.nttdata.bank.bootcoin.mapper;

import com.nttdata.bank.bootcoin.model.Purchase;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PurchaseMapper implements EntityMapper<Purchase, com.nttdata.bank.bootcoin.domain.Purchase> {
    @Override
    public com.nttdata.bank.bootcoin.domain.Purchase toDomain(Purchase model) {
        com.nttdata.bank.bootcoin.domain.Purchase domain = new com.nttdata.bank.bootcoin.domain.Purchase();
        BeanUtils.copyProperties(model, domain);
        return domain;
    }

    @Override
    public Purchase toModel(com.nttdata.bank.bootcoin.domain.Purchase domain) {
        Purchase model = new Purchase();
        BeanUtils.copyProperties(domain, model);
        return model;
    }
}
