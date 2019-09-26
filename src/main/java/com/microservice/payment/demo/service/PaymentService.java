package com.microservice.payment.demo.service;
import com.microservice.payment.demo.DTO.*;

public interface PaymentService {
    void performPayment(StatusDTO status,PaymentMethodDTO paymentMethod );
    void getPrice();
    void getPayment();
}
