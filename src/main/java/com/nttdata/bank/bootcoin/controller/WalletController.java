package com.nttdata.bank.bootcoin.controller;

import com.nttdata.bank.bootcoin.api.ExchangesApi;
import com.nttdata.bank.bootcoin.mapper.*;
import com.nttdata.bank.bootcoin.model.*;
import com.nttdata.bank.bootcoin.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WalletController implements ExchangesApi {

    // Service
    private final CurrencyService currencyService;
    private final ProviderService providerService;
    private final PurchaseService purchaseService;
    private final TransactionService transactionService;
    private final WalletService walletService;

    // Mapper
    private final CurrencyMapper currencyMapper;
    private final ProviderMapper providerMapper;
    private final PurchaseMapper purchaseMapper;
    private final TransactionMapper transactionMapper;
    private final WalletMapper walletMapper;

    public WalletController(CurrencyService currencyService, ProviderService providerService, PurchaseService purchaseService,
                            TransactionService transactionService, WalletService walletService, CurrencyMapper currencyMapper,
                            ProviderMapper providerMapper, PurchaseMapper purchaseMapper, TransactionMapper transactionMapper,
                            WalletMapper walletMapper) {
        this.currencyService = currencyService;
        this.providerService = providerService;
        this.purchaseService = purchaseService;
        this.transactionService = transactionService;
        this.walletService = walletService;
        this.currencyMapper = currencyMapper;
        this.providerMapper = providerMapper;
        this.purchaseMapper = purchaseMapper;
        this.transactionMapper = transactionMapper;
        this.walletMapper = walletMapper;
    }

    // Currency Domain

    @Override
    public Mono<ResponseEntity<Currency>> createCurrency(Mono<Currency> currency, ServerWebExchange exchange) {
        return currencyService.save(currency.map(currencyMapper::toDomain))
                .map(currencyMapper::toModel)
                .map(c -> ResponseEntity.status(HttpStatus.OK).body(c))
                .onErrorResume(e -> Mono.just(ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)));
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteCurrency(String currencyId, ServerWebExchange exchange) {
        return currencyService.delete(currencyId)
                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Flux<Currency>>> getAllCurrencies(ServerWebExchange exchange) {
        Flux<Currency> creditsFlux = currencyService.getAll()
                .map(currencyMapper::toModel);
        return Mono.just(ResponseEntity.ok(creditsFlux))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Currency>> getCurrencyById(String currencyId, ServerWebExchange exchange) {
        return currencyService.findById(currencyId)
                .map(currencyMapper::toModel)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Currency>> updateCurrency(String currencyId, Mono<Currency> currency, ServerWebExchange exchange) {
        return currencyService.update(currencyId, currency.map(currencyMapper::toDomain))
                .map(currencyMapper::toModel)
                .map(c -> ResponseEntity.status(HttpStatus.OK).body(c))
                .onErrorResume(e -> Mono.just(ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)));
    }

    // Provider Domain

    @Override
    public Mono<ResponseEntity<Provider>> createProvider(Mono<Provider> provider, ServerWebExchange exchange) {
        return ExchangesApi.super.createProvider(provider, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteProvider(String providerId, ServerWebExchange exchange) {
        return ExchangesApi.super.deleteProvider(providerId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Provider>>> getAllProviders(ServerWebExchange exchange) {
        return ExchangesApi.super.getAllProviders(exchange);
    }

    @Override
    public Mono<ResponseEntity<Provider>> getProviderBalance(String numberPhone, ServerWebExchange exchange) {
        return ExchangesApi.super.getProviderBalance(numberPhone, exchange);
    }

    @Override
    public Mono<ResponseEntity<Provider>> getProviderById(String providerId, ServerWebExchange exchange) {
        return ExchangesApi.super.getProviderById(providerId, exchange);
    }

    // Purchase Domain

    @Override
    public Mono<ResponseEntity<Purchase>> createPurchase(Mono<Purchase> purchase, ServerWebExchange exchange) {
        return ExchangesApi.super.createPurchase(purchase, exchange);
    }

    @Override
    public Mono<ResponseEntity<Purchase>> getPurchaseByTransactionId(String transactionId, ServerWebExchange exchange) {
        return ExchangesApi.super.getPurchaseByTransactionId(transactionId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Purchase>>> getPurchasesByDocumentNumber(String documentNumber, ServerWebExchange exchange) {
        return ExchangesApi.super.getPurchasesByDocumentNumber(documentNumber, exchange);
    }

    // Transaction Domain

    @Override
    public Mono<ResponseEntity<Transaction>> createTransaction(Mono<OperationResponse> operationResponse, ServerWebExchange exchange) {
        return ExchangesApi.super.createTransaction(operationResponse, exchange);
    }

    @Override
    public Mono<ResponseEntity<Transaction>> getTransactionById(String transactionId, ServerWebExchange exchange) {
        return ExchangesApi.super.getTransactionById(transactionId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Transaction>>> getTransactionsByDocumentNumber(String documentNumber, ServerWebExchange exchange) {
        return ExchangesApi.super.getTransactionsByDocumentNumber(documentNumber, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Transaction>>> getTransactionsByProviderId(String providerId, ServerWebExchange exchange) {
        return ExchangesApi.super.getTransactionsByProviderId(providerId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> acceptTransactionByProvider(String providerId, String transactionId, ServerWebExchange exchange) {
        return ExchangesApi.super.acceptTransactionByProvider(providerId, transactionId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> rejectTransactionByProvider(String providerId, String transactionId, ServerWebExchange exchange) {
        return ExchangesApi.super.rejectTransactionByProvider(providerId, transactionId, exchange);
    }

    // Wallet Domain

    @Override
    public Mono<ResponseEntity<Wallet>> createWallet(Mono<Wallet> wallet, ServerWebExchange exchange) {
        return ExchangesApi.super.createWallet(wallet, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteWallet(String walletId, ServerWebExchange exchange) {
        return ExchangesApi.super.deleteWallet(walletId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Wallet>> getWalletByPhoneNumber(String phoneNumber, ServerWebExchange exchange) {
        return ExchangesApi.super.getWalletByPhoneNumber(phoneNumber, exchange);
    }

    @Override
    public Mono<ResponseEntity<Wallet>> updateWallet(String walletId, Mono<Wallet> wallet, ServerWebExchange exchange) {
        return ExchangesApi.super.updateWallet(walletId, wallet, exchange);
    }

}
