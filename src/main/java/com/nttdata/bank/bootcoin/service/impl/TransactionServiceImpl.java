package com.nttdata.bank.bootcoin.service.impl;

import com.nttdata.bank.bootcoin.domain.Operation;
import com.nttdata.bank.bootcoin.domain.Transaction;
import com.nttdata.bank.bootcoin.service.TransactionService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public Mono<Transaction> createTransaction(Mono<Operation> operation) {
        return null;
    }

    @Override
    public Mono<Transaction> findById(String transactionId) {
        return null;
    }

    @Override
    public Flux<Transaction> findByDocumentNumber(String documentNumber) {
        return null;
    }

    @Override
    public Flux<Transaction> findByProviderId(String providerId) {
        return null;
    }

    @Override
    public Mono<Transaction> acceptPurchaseByProvider(String providerId, String TransactionId) {
        return null;
    }

    @Override
    public Mono<Transaction> rejectPurchaseByProvider(String providerId, String TransactionId) {
        return null;
    }
}
