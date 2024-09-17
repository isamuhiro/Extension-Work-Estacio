package com.estacio.work.extension.app.models.ticket;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class Ticket {
    private UUID id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private UUID userId;
    private UUID category;
}
