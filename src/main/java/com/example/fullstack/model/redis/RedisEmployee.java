package com.example.fullstack.model.redis;

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
public class RedisEmployee implements Serializable {

    private String id;
    private String firstName;
    private String lastName;
    private String nationalNumber;

}
