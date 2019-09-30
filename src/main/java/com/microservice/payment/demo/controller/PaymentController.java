package com.microservice.payment.demo.controller;

import com.microservice.payment.demo.DTO.PaymentMethodDTO;
import com.microservice.payment.demo.DTO.StatusDTO;
import com.microservice.payment.demo.entity.Payment;
import com.microservice.payment.demo.service.PaymentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentServiceImpl paymentService;
    public PaymentController(PaymentServiceImpl paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping("/perform")
    public void PerformPayment(UUID id, PaymentMethodDTO paymentMethod){
        paymentService.performPayment(id, paymentMethod);
    }
    @GetMapping("/price/{id}")
    public Double GetPrice(@PathVariable("id") UUID paymentId){
        return paymentService.getPrice(paymentId);
    }
    @GetMapping("/{id}")
    public Payment GetPayment(@PathVariable("id") UUID paymentId){
        return paymentService.getPayment(paymentId);
    }

}
