package com.nttdata.bank.bootcoin.service.impl;

import com.nttdata.bank.bootcoin.domain.Currency;
import com.nttdata.bank.bootcoin.repository.CurrencyRepository;
import com.nttdata.bank.bootcoin.service.CurrencyService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyRepository currencyRepository;

    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public Mono<Currency> save(Mono<Currency> currency) {
        return currency.flatMap(currencyRepository::save);
    }

    @Override
    public Mono<Currency> findById(String currencyId) {
        return currencyRepository.findById(currencyId);
    }

    @Override
    public Mono<Currency> update(String currencyId, Mono<Currency> currency) {
        return currencyRepository.findById(currencyId)
                .flatMap(c -> currency)
                .doOnNext(e -> e.setId(currencyId))
                .flatMap(currencyRepository::save);
    }

    @Override
    public Flux<Currency> getAll() {
        return currencyRepository.findAll();
    }

    @Override
    public Mono<Void> delete(String currencyId) {
        return currencyRepository.findById(currencyId)
                .flatMap(currencyRepository::delete);
    }
}
