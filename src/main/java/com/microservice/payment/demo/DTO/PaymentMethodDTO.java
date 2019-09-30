package com.microservice.payment.demo.DTO;

import java.util.UUID;

public class PaymentMethodDTO {
    private UUID id;
    private String name;

    void setId(UUID id) {
        this.id = id;
    }

    UUID getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
