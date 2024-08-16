package com.artem.spring_rabbitmq_training.resource;

import com.artem.spring_rabbitmq_training.publisher.RabbitMQProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageResource {
    private final RabbitMQProducer rabbitMQProducer;

    @GetMapping("/publish")
    public void sendMessage(@RequestParam("message") String message) {
        rabbitMQProducer.sendMessage(message);
    }
}
