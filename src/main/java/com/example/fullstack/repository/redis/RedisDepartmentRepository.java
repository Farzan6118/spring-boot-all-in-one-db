package com.example.fullstack.repository.redis;

import com.example.fullstack.model.redis.RedisDepartment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisDepartmentRepository extends CrudRepository<RedisDepartment, String> {

}
