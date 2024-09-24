package com.przemyslawren.OrderEventsProducer.domain;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
public record OrderEvent(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer orderEventId,

        @Enumerated(EnumType.STRING)
        OrderEventType orderEventType,

        @OneToOne(
                mappedBy = "orderEvent",
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY
        )
        @ToString.Exclude
        Order order
) {}
