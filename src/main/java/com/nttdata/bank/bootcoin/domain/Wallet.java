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
@Document(collection = "wallet")
public class Wallet {
    @Id
    private String id;
    private String documentTypeCode;
    private String dni;
    private String phoneNumber;
    private Double balance;
    private String email;
    private Date createdAt;
}