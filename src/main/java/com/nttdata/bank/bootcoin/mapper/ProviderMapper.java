package com.nttdata.bank.bootcoin.mapper;

import com.nttdata.bank.bootcoin.model.Provider;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProviderMapper implements EntityMapper<Provider, com.nttdata.bank.bootcoin.domain.Provider> {
    @Override
    public com.nttdata.bank.bootcoin.domain.Provider toDomain(Provider model) {
        com.nttdata.bank.bootcoin.domain.Provider domain = new com.nttdata.bank.bootcoin.domain.Provider();
        BeanUtils.copyProperties(model, domain);
        return domain;
    }

    @Override
    public Provider toModel(com.nttdata.bank.bootcoin.domain.Provider domain) {
        Provider model = new Provider();
        BeanUtils.copyProperties(domain, model);
        return model;
    }
}