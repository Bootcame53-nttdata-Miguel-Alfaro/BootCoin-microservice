package com.nttdata.bank.bootcoin.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operation {
    private Double amount;
    private String payMethodCode;
    private String documentNumber;
    private String providerId;
}
