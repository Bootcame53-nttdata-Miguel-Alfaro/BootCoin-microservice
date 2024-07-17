package com.nttdata.bank.bootcoin.service.impl;

import com.nttdata.bank.bootcoin.domain.Provider;
import com.nttdata.bank.bootcoin.service.ProviderService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public Mono<Provider> save(Mono<Provider> provider) {
        return null;
    }

    @Override
    public Mono<Provider> findById(String providerId) {
        return null;
    }

    @Override
    public Flux<Provider> getAll() {
        return null;
    }

    @Override
    public Mono<Provider> getBalance(String numberPhone) {
        return null;
    }

    @Override
    public Mono<Void> delete(String providerId) {
        return null;
    }
}
