package com.microservice.payment.demo.repository;

import com.microservice.payment.demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findById(UUID id);

}
