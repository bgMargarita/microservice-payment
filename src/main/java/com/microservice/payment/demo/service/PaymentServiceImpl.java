package com.microservice.payment.demo.service;

import com.microservice.payment.demo.DTO.*;

import com.microservice.payment.demo.entity.Payment;
import com.microservice.payment.demo.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void performPayment(StatusDTO status, PaymentMethodDTO paymentMethod) {
        Payment payment = new Payment();
    }

    @Override
    public Double getPrice(UUID id) {
        return paymentRepository.findById(id).getTotalPrice();
    }

    @Override
    public Payment getPayment(UUID id) {
        return paymentRepository.findById(id);
    }

}
