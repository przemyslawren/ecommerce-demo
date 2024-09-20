package com.przemyslawren.OrderEventsProducer.domain;

import java.time.LocalDateTime;
import java.util.List;

public record Order(
        Integer orderId,
        List<Item> items,
        Integer totalAmount,
        Customer customer,
        ShippingAddress shippingAddress,
        LocalDateTime orderDateTime
) {}
