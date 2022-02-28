package com.example.fullstack.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "department")
public class MongoDepartment {

    @MongoId
    private String id;
    private String name;
    private String location;
//    @Transient
//    private Employee employee;

}
