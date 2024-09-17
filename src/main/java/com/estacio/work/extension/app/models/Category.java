package com.estacio.work.extension.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;


@AllArgsConstructor
@Getter
public class Category {
    private UUID id;
    private String name;
}
