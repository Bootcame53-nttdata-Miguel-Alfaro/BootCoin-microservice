package com.nttdata.bank.bootcoin.service;


import com.nttdata.bank.bootcoin.domain.Operation;
import com.nttdata.bank.bootcoin.domain.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {
    Mono<Transaction> createTransaction(Mono<Operation> operation);
    Mono<Transaction> findById(String transactionId);
    Flux<Transaction> findByDocumentNumber(String documentNumber);
    Flux<Transaction> findByProviderId(String providerId);
    Mono<Transaction> acceptPurchaseByProvider(String providerId, String TransactionId);
    Mono<Transaction> rejectPurchaseByProvider(String providerId, String TransactionId);
}