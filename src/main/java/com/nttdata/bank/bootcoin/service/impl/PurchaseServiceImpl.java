package com.nttdata.bank.bootcoin.service.impl;

import com.nttdata.bank.bootcoin.domain.Purchase;
import com.nttdata.bank.bootcoin.service.PurchaseService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public Mono<Purchase> createPurchase(String transactionId, String payMethodDetail) {
        return null;
    }

    @Override
    public Mono<Purchase> findByTransactionId(String transactionId) {
        return null;
    }

    @Override
    public Flux<Purchase> findByDocumentNumber(String documentNumber) {
        return null;
    }
}
