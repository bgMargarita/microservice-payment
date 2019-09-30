package com.microservice.payment.demo.service;

import com.microservice.payment.demo.DTO.*;
import com.microservice.payment.demo.entity.Payment;

import java.util.UUID;

public interface PaymentService {
    void performPayment(UUID id, StatusDTO status, PaymentMethodDTO paymentMethod);

    Double getPrice(UUID id);

    Payment getPayment(UUID id);
}
