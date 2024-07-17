package com.nttdata.bank.bootcoin.repository;

import com.nttdata.bank.bootcoin.domain.Purchase;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PurchaseRepository extends ReactiveMongoRepository<Purchase, String> {
    Mono<Purchase> findByDocumentNumber(String documentNumber);
    Mono<Purchase> findByTransactionId(String transactionId);
}
