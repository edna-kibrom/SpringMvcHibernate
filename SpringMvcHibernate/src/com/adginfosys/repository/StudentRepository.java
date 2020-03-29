package com.adginfosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adginfosys.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
