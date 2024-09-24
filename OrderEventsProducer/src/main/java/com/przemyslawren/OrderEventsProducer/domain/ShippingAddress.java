package com.przemyslawren.OrderEventsProducer.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public record ShippingAddress(
        Integer id,
        String street,
        String city,
        String state,
        String country,
        String zipCode
) {
}
