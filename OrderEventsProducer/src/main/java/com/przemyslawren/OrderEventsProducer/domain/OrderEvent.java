package com.przemyslawren.OrderEventsProducer.domain;

import java.time.LocalDateTime;

public record OrderEvent(
        Integer orderEventId,
        OrderEventType orderEventType,
        Order order
) {}
