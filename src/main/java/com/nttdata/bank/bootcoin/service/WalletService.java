package com.nttdata.bank.bootcoin.service;


import com.nttdata.bank.bootcoin.domain.Wallet;
import reactor.core.publisher.Mono;

public interface WalletService {
    Mono<Wallet> save(Mono<Wallet> currency);
    Mono<Wallet> findByNumberPhone(String numberPhone);
    Mono<Wallet> update(String walletId, Mono<Wallet> wallet);
    Mono<Void> delete(String walletId);
}