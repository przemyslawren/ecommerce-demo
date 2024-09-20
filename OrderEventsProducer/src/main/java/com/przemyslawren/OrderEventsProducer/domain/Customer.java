package com.przemyslawren.OrderEventsProducer.domain;

public record Customer(
        Integer customerId,
        String customerName,
        String customerEmail
) {
}
