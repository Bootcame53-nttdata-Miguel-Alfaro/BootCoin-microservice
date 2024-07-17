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
@Document(collection = "provider")
public class Provider {
    @Id
    private String id;
    private String name;
    private Double lastname;
    private String email;
    private String phone;
    private String bankAccountNumber;
    private String balance;
    private Date createdAt;
}
