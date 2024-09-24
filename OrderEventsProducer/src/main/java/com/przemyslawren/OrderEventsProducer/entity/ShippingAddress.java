package com.przemyslawren.OrderEventsProducer.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingAddress{

    String street;
    String city;
    String state;
    String country;
    String zipCode;
}
