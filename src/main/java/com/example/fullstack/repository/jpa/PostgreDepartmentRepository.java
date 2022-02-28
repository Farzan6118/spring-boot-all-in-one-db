package com.example.fullstack.repository.jpa;


import com.example.fullstack.model.postgre.PostgreDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgreDepartmentRepository extends JpaRepository<PostgreDepartment, Long> {

}
