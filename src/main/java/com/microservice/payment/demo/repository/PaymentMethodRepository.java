package com.microservice.payment.demo.repository;

import com.microservice.payment.demo.DTO.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethodDTO, Long> {
    PaymentMethodDTO findById(UUID id);
}
