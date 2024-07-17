package com.nttdata.bank.bootcoin.service;

import com.nttdata.bank.bootcoin.domain.Provider;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProviderService {
    Mono<Provider> save(Mono<Provider> provider);
    Mono<Provider> findById(String providerId);
    Flux<Provider> getAll();
    Mono<Provider> getBalance(String numberPhone);
    Mono<Void> delete(String providerId);
}
