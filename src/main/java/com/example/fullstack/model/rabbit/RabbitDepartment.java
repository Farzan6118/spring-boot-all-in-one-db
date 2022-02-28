package com.example.fullstack.model.rabbit;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@Builder
@RedisHash("department")
public class RabbitDepartment implements Serializable {

    private String id;
    private String name;
    private String location;
//    @Transient
//    private Employee employee;

}
