package com.microservice.payment.demo.service;

import com.microservice.payment.demo.DTO.PaymentMethodDTO;

import java.util.UUID;

public interface PaymentMethodService {
    PaymentMethodDTO findById(UUID id);
}
