package com.nttdata.bank.bootcoin.repository;

import com.nttdata.bank.bootcoin.domain.Currency;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CurrencyRepository extends ReactiveMongoRepository<Currency, String> {
}
