package com.nttdata.bank.bootcoin.mapper;

import com.nttdata.bank.bootcoin.domain.Operation;
import com.nttdata.bank.bootcoin.model.OperationResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OperationMapper implements EntityMapper<OperationResponse, Operation>{
    @Override
    public Operation toDomain(OperationResponse model) {
        Operation domain = new Operation();
        BeanUtils.copyProperties(model, domain);
        return domain;
    }

    @Override
    public OperationResponse toModel(Operation domain) {
        OperationResponse model = new OperationResponse();
        BeanUtils.copyProperties(domain, model);
        return model;
    }
}
