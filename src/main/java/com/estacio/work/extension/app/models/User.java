package com.estacio.work.extension.app.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.UUID;


@AllArgsConstructor
@Getter
public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private UUID departmentId;
}
