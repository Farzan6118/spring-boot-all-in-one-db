package com.example.fullstack.controller;

import lombok.RequiredArgsConstructor;
import com.example.fullstack.dto.Department;
import com.example.fullstack.model.mongo.MongoDepartment;
import com.example.fullstack.model.postgre.PostgreDepartment;
import com.example.fullstack.model.redis.RedisDepartment;
import com.example.fullstack.repository.jpa.PostgreDepartmentRepository;
import com.example.fullstack.repository.mongo.MongoDepartmentRepository;
import com.example.fullstack.repository.redis.RedisDepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class TheController {

    private final AtomicLong atomicLong = new AtomicLong(1L);
    private final PostgreDepartmentRepository postgreDepartmentRepository;
    private final MongoDepartmentRepository mongoDepartmentRepository;
    private final RedisDepartmentRepository redisDepartmentRepository;

    @PostMapping("insertTest")
    public void getUsers(@RequestBody Department department) {
        postgreDepartmentRepository.save(PostgreDepartment.builder().id(atomicLong.get()).location(department.getLocation()).name(department.getName()).build());
        mongoDepartmentRepository.save(MongoDepartment.builder().id(String.valueOf(atomicLong.get())).location(department.getLocation()).name(department.getName()).build());
        redisDepartmentRepository.save(RedisDepartment.builder().id(String.valueOf(atomicLong.get())).location(department.getLocation()).name(department.getName()).build());
        atomicLong.set(atomicLong.get()+1);
    }

    @GetMapping("test")
    public String testDemoOne() {
    return "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h2>Width and Height Attributes</h2>\n" +
            "\n" +
            "<p>The width and height attributes of the img tag, defines the width and height of the image:</p>\n" +
            "\n" +
            "<img src=\"https://www.w3schools.com/html/img_girl.jpg\" width=\"500\" height=\"600\">\n" +
            "\n" +
            "</body>\n" +
            "</html>\n" +
            "\n";
    }

}
