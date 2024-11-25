package com.javabymj.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String firstName;
    private String email;
    private String gender;
    private String lastName;
}
