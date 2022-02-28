package com.example.fullstack.model.rabbit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("employee")
public class RabbitEmployee implements Serializable {

    private String id;
    private String firstName;
    private String lastName;
    private String nationalNumber;

}
