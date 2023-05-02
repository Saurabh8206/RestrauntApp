package com.app.restraunt.model;

import lombok.*;

@NoArgsConstructor
@ToString
@Data
@Getter
@Setter
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

}

