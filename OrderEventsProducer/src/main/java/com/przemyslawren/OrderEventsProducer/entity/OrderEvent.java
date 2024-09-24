package com.przemyslawren.OrderEventsProducer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer orderEventId;

        @Enumerated(EnumType.STRING)
        OrderEventType orderEventType;

        @OneToOne(
                mappedBy = "orderEvent",
                cascade = CascadeType.ALL)
        @ToString.Exclude
        Order order;
}
