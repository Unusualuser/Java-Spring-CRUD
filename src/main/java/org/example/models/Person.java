package org.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    private int age;
    private String email;

}
