package com.nttdata.bank.bootcoin.repository;

import com.nttdata.bank.bootcoin.domain.Wallet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface WalletRepository extends ReactiveMongoRepository<Wallet,String> {
    Mono<Wallet> findByPhoneNumber(String numberPhone);
}
