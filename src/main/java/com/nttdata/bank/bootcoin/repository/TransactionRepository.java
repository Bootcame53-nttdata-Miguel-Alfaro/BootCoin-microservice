package com.nttdata.bank.bootcoin.repository;

import com.nttdata.bank.bootcoin.domain.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    Mono<Transaction> findByDocumentNumber(String documentNumber);
    Mono<Transaction> findByProviderId(String providerId);
}
