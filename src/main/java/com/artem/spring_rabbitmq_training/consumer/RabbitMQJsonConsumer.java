package com.artem.spring_rabbitmq_training.consumer;

import com.artem.spring_rabbitmq_training.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQJsonConsumer {
    @RabbitListener(queues = "${jsonQueue.name}")
    public void consume(UserDto userDto) {
        log.info("Consuming json message: {}", userDto);
    }
}
