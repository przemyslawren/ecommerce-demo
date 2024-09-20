package com.przemyslawren.OrderEventsProducer.domain;

public record ShippingAddress(
        Integer id,
        String street,
        String city,
        String state,
        String country,
        String zipCode
) {
}
