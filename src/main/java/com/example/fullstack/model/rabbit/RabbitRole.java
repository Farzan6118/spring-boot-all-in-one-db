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
@RedisHash("role")
public class RabbitRole implements Serializable {

    private String id;
    private String name;
//    @Transient
//    private Department department;

}
