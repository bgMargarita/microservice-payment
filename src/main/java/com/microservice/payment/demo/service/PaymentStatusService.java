package com.microservice.payment.demo.service;

import com.microservice.payment.demo.DTO.PaymentMethodDTO;
import com.microservice.payment.demo.DTO.StatusDTO;
import org.apache.logging.log4j.status.StatusData;

import java.util.UUID;

public interface PaymentStatusService{
    StatusDTO findById(UUID id);
}
