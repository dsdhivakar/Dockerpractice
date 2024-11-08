package com.docker.practice1.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.practice1.modal.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	
}
