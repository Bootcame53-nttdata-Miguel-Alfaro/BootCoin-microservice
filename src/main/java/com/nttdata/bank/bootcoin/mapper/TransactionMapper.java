package com.nttdata.bank.bootcoin.mapper;

import com.nttdata.bank.bootcoin.model.Transaction;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper implements EntityMapper<Transaction, com.nttdata.bank.bootcoin.domain.Transaction>{
    @Override
    public com.nttdata.bank.bootcoin.domain.Transaction toDomain(Transaction model) {
        com.nttdata.bank.bootcoin.domain.Transaction domain = new com.nttdata.bank.bootcoin.domain.Transaction();
        BeanUtils.copyProperties(model, domain);
        return domain;
    }

    @Override
    public Transaction toModel(com.nttdata.bank.bootcoin.domain.Transaction domain) {
        Transaction model = new Transaction();
        BeanUtils.copyProperties(domain, model);
        return model;
    }
}
