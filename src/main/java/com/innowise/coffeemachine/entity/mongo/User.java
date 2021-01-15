package com.innowise.coffeemachine.entity.mongo;

import com.innowise.coffeemachine.entity.jpa.CardAccount;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    private String id;
    private String firstName;
    private String surname;

    private String email;
    private String password;
    private boolean activity;
    private List<CardAccount> cardAccounts;

}
