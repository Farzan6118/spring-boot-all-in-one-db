package com.example.fullstack.repository.redis;

import com.example.fullstack.model.redis.RedisRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRoleRepository extends MongoRepository<RedisRole, String> {
}
