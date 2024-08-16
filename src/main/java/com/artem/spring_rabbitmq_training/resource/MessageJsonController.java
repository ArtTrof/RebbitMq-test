package com.artem.spring_rabbitmq_training.resource;

import com.artem.spring_rabbitmq_training.dto.UserDto;
import com.artem.spring_rabbitmq_training.publisher.RabbitMQJsonProducer;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageJsonController {

    private static final Logger log = LoggerFactory.getLogger(MessageJsonController.class);
    private final RabbitMQJsonProducer rabbitMQJsonProducer;

    @PostMapping("/publishJson")
    public void sendJsonMessage(@RequestBody UserDto userDto) {
        rabbitMQJsonProducer.sendJsonMessage(userDto);
        log.info("Message sent: {}", userDto.toString());
    }
}
