package com.przemyslawren.OrderEventsProducer.domain;

public record Item(
        Integer itemId,
        String itemName,
        Integer itemQuantity,
        Integer itemPrice
) {
}
