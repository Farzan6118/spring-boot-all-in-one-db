package com.example.fullstack.model.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@Builder
@RedisHash("department")
public class RedisDepartment implements Serializable {

    private String id;
    private String name;
    private String location;
//    @Transient
//    private Employee employee;

}
