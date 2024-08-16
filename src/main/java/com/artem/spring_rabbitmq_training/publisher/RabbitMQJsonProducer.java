package com.artem.spring_rabbitmq_training.publisher;

import com.artem.spring_rabbitmq_training.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQJsonProducer {
    @Value("${topic.exchange}")
    private String exchange;
    @Value("${jsonRouting.key}")
    private String routingJsonKey;

    private final RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(UserDto userDto) {
        log.info("Sending message: {}", userDto.toString());
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, userDto);
    }
}
