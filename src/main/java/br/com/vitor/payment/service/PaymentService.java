package br.com.vitor.payment.service;

import br.com.vitor.checkout.event.CheckoutCreatedEvent;
import br.com.vitor.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}