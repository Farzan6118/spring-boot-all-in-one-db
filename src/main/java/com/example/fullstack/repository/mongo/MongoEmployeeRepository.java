package com.example.fullstack.repository.mongo;

import com.example.fullstack.model.mongo.MongoEmployee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoEmployeeRepository extends MongoRepository<MongoEmployee, String> {
}
