package com.microservice.payment.demo.service;

import com.microservice.payment.demo.DTO.PaymentMethodDTO;
import com.microservice.payment.demo.repository.PaymentMethodRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
     private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodServiceImpl(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    @Override
    public PaymentMethodDTO findById(UUID id) {
        return paymentMethodRepository.findById(id);
    }
}
