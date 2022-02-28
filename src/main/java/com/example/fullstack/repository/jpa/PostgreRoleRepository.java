package com.example.fullstack.repository.jpa;

import com.example.fullstack.model.postgre.PostgreRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgreRoleRepository extends JpaRepository<PostgreRole, Long> {
}
