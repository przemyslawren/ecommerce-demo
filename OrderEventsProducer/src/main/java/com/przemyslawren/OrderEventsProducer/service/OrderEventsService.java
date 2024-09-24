package com.przemyslawren.OrderEventsProducer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.przemyslawren.OrderEventsProducer.entity.OrderEvent;
import com.przemyslawren.OrderEventsProducer.producer.OrderEventsProducer;
import com.przemyslawren.OrderEventsProducer.repository.OrderEventsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderEventsService {
    private final OrderEventsRepository orderEventsRepository;
    private final OrderEventsProducer orderEventsProducer;

    public void saveOrderEvent(OrderEvent orderEvent) {
        orderEventsRepository.save(orderEvent);
    }

    public void sendOrderEvent(OrderEvent orderEvent) throws JsonProcessingException {
        orderEventsProducer.sendOrderEvent(orderEvent);
    }
}
