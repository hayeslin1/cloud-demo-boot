package com.hayes.code.clouddemoboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class User {

    private String name ;
    private int age ;

    public User(String name , int age ) {
        name = name ;
        age = age ;
    }
}
