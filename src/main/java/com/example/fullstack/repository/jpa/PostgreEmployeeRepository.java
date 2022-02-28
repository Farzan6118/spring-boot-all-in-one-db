package com.example.fullstack.repository.jpa;

import com.example.fullstack.model.postgre.PostgreEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgreEmployeeRepository extends JpaRepository<PostgreEmployee, Long> {
}
