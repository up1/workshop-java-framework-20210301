package com.example.kbtg.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.EqualsExclude;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class UserResponse {
    private int id;
    private String name;
    private int age;
}
