package com.przemyslawren.OrderEventsProducer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Customer(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer customerId,
        String customerName,
        String customerEmail
) {
}
