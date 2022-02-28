package com.example.fullstack.repository.redis;

import com.example.fullstack.model.redis.RedisEmployee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisEmployeeRepository extends MongoRepository<RedisEmployee, String> {
}
