package com.artem.spring_rabbitmq_training.dto;

import lombok.Value;

@Value(staticConstructor = "of")
public class UserDto {
    String surname;
    String name;
}
