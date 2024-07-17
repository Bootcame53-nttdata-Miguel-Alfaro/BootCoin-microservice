package com.nttdata.bank.bootcoin.service.impl;

import com.nttdata.bank.bootcoin.domain.Wallet;
import com.nttdata.bank.bootcoin.service.WalletService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WalletServiceImpl implements WalletService {
    @Override
    public Mono<Wallet> save(Mono<Wallet> currency) {
        return null;
    }

    @Override
    public Mono<Wallet> findByNumberPhone(String numberPhone) {
        return null;
    }

    @Override
    public Mono<Wallet> update(String walletId, Mono<Wallet> wallet) {
        return null;
    }

    @Override
    public Mono<Void> delete(String walletId) {
        return null;
    }
}
