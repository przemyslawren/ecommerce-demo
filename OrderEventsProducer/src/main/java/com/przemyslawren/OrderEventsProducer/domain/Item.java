package com.przemyslawren.OrderEventsProducer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Item(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer itemId,
        String itemName,
        Integer itemQuantity,
        Integer itemPrice
) {
}
