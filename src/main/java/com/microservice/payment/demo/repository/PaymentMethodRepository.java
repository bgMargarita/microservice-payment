package com.microservice.payment.demo.repository;
import com.microservice.payment.demo.DTO.*;

import java.util.UUID;

public interface PaymentMethodRepository {
    PaymentMethodDTO findById(UUID id);
}
