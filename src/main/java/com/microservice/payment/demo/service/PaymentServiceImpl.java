package com.microservice.payment.demo.service;
import com.microservice.payment.demo.DTO.*;

import com.microservice.payment.demo.entity.Payment;
import com.microservice.payment.demo.repository.PaymentRepository;

public class PaymentServiceImpl implements PaymentService {
    PaymentRepository paymentRepository;
    @Override
    public void performPayment(StatusDTO status, PaymentMethodDTO paymentMethod) {
        Payment payment = new Payment();

    }

    @Override
    public void getPrice() {
        for(item : Payment){

        }
    }

    @Override
    public void getPayment() {
        return
    }

}
