package com.przemyslawren.OrderEventsProducer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer orderId;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "order_id")
        List<Item> items;
        Integer totalAmount;

        @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "customer_id")
        Customer customer;

        @OneToOne
        @JoinColumn(name = "order_event_id")
        OrderEvent orderEvent;

        @Embedded
        ShippingAddress shippingAddress;
}
