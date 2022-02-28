package com.example.fullstack.repository.mongo;

import com.example.fullstack.model.mongo.MongoRole;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRoleRepository extends MongoRepository<MongoRole, String> {
}
