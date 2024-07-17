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
@Document(collection = "purchase")
public class Purchase {
    @Id
    private String id;
    private String transactionId;
    private String providerId;
    private String documentNumber;
    private String amount;
    private Double exchangeRate;
    private String payMethodCode;
    private Date createdAt;
}
