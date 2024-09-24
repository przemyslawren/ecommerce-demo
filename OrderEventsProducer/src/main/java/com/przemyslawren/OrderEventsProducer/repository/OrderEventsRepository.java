package com.przemyslawren.OrderEventsProducer.repository;

import com.przemyslawren.OrderEventsProducer.domain.OrderEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEventsRepository extends JpaRepository<OrderEvent, Integer> {
}
