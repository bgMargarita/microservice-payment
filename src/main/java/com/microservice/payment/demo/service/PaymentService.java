package com.microservice.payment.demo.service;
import com.microservice.payment.demo.DTO.*;

import java.util.UUID;

public interface PaymentService {
    void performPayment(StatusDTO status,PaymentMethodDTO paymentMethod );
    void getPrice(UUID id);
    void getPayment(UUID id);
}
