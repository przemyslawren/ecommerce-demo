package com.przemyslawren.OrderEventsProducer.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public record Order(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer orderId,

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "order_id")
        List<Item> items,
        Integer totalAmount,

        @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "customer_id")
        Customer customer,

        @Embedded
        ShippingAddress shippingAddress,
        LocalDateTime orderDateTime,

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "order_event_id")
        OrderEvent orderEvent
) {}
