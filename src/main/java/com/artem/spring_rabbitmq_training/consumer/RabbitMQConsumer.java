package com.artem.spring_rabbitmq_training.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQConsumer {
    @RabbitListener(queues = "${queue.name}")
    public void consume(String message){
        log.info("Consuming message: {}", message);
    }
}
