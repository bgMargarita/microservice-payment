package com.microservice.payment.demo.service;

import com.microservice.payment.demo.DTO.PaymentMethodDTO;
import com.microservice.payment.demo.DTO.StatusDTO;
import com.microservice.payment.demo.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentStatusServiceImpl implements PaymentStatusService {
    private final StatusRepository statusRepository;

    public PaymentStatusServiceImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public StatusDTO findById(UUID id) {
        return  statusRepository.findById(id);
    }
}
