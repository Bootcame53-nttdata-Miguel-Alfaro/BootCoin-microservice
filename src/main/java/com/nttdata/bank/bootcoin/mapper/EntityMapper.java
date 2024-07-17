package com.nttdata.bank.bootcoin.mapper;

public interface EntityMapper <D, E>{
    E toDomain(D model);
    D toModel(E domain);
}