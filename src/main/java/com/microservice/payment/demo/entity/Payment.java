package com.microservice.payment.demo.entity;

import com.microservice.payment.demo.DTO.PaymentMethodDTO;
import com.microservice.payment.demo.DTO.StatusDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private StatusDTO status;
    private String clientName;
    private UUID orderId;
    private PaymentMethodDTO paymentMethod;
    private Double totalPrice;

    public Payment() {

    }

    public Payment(UUID id, StatusDTO status, String clientName, UUID orderId, PaymentMethodDTO paymentMethod, Double totalPrice) {

        this.id = id;
        this.status = status;
        this.clientName = clientName;
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentMethodDTO getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodDTO paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
