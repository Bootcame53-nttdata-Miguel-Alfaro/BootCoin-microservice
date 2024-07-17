package com.nttdata.bank.bootcoin.mapper;

import com.nttdata.bank.bootcoin.model.Wallet;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class WalletMapper implements EntityMapper<Wallet, com.nttdata.bank.bootcoin.domain.Wallet>{
    @Override
    public com.nttdata.bank.bootcoin.domain.Wallet toDomain(Wallet model) {
        com.nttdata.bank.bootcoin.domain.Wallet domain = new com.nttdata.bank.bootcoin.domain.Wallet();
        BeanUtils.copyProperties(model, domain);
        return domain;
    }

    @Override
    public Wallet toModel(com.nttdata.bank.bootcoin.domain.Wallet domain) {
        Wallet model = new Wallet();
        BeanUtils.copyProperties(domain, model);
        return model;
    }
}
