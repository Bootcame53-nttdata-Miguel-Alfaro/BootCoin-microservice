package com.nttdata.bank.bootcoin.service;

import com.nttdata.bank.bootcoin.domain.Currency;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CurrencyService {
    Mono<Currency> save(Mono<Currency> currency);
    Mono<Currency> findById(String currencyId);
    Mono<Currency> update(String currencyId, Mono<Currency> currency);
    Flux<Currency> getAll();
    Mono<Void> delete(String currencyId);
}
