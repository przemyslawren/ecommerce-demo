package com.przemyslawren.OrderEventsProducer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.przemyslawren.OrderEventsProducer.entity.OrderEvent;
import com.przemyslawren.OrderEventsProducer.service.OrderEventsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api")
public class OrderEventsController {
    private final OrderEventsService orderEventsService;

    @PostMapping("/v1/orderevent")
    public ResponseEntity<OrderEvent> postOrderEvent(
            @RequestBody @Valid OrderEvent orderEvent
    ) throws JsonProcessingException {

        log.info("Received orderEvent: {} ", orderEvent);
        orderEventsService.saveOrderEvent(orderEvent);
        log.info("After saving orderEvent: {} ", orderEvent);
        orderEventsService.sendOrderEvent(orderEvent);
        log.info("After sending orderEvent: {} ", orderEvent);

        return ResponseEntity.status(HttpStatus.CREATED).body(orderEvent);
    }
}
