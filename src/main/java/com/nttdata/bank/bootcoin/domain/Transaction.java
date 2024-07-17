package com.nttdata.bank.bootcoin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    private Double amount;
    private String payMethodCode;
    private String payMethod;
    private String documentNumber;
    private String providerId;
    private String status;
    private Double exchangeRate;
    private Date createdAt;
}
