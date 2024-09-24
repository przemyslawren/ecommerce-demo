package com.przemyslawren.OrderEventsProducer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer itemId;
        String itemName;
        Integer itemQuantity;
        Integer itemPrice;
}
