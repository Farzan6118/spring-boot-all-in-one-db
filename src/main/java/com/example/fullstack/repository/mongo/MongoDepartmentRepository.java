package com.example.fullstack.repository.mongo;

import com.example.fullstack.model.mongo.MongoDepartment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDepartmentRepository extends MongoRepository<MongoDepartment, String> {

}
