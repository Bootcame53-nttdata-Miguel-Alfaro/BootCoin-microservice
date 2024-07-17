package com.nttdata.bank.bootcoin.service;

import com.nttdata.bank.bootcoin.domain.Purchase;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurchaseService {
    Mono<Purchase> createPurchase(String transactionId, String payMethodDetail);
    Mono<Purchase> findByTransactionId(String transactionId);
    Flux<Purchase> findByDocumentNumber(String documentNumber);
}
