package com.nttdata.bank.bootcoin.repository;

import com.nttdata.bank.bootcoin.domain.Provider;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProviderRepository extends ReactiveMongoRepository<Provider, String> {
}
