package com.nttdata.bank.bootcoin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "currency")
public class Currency {
    @Id
    private String id;
    private String name;
    private Double exchangeRate;
}
