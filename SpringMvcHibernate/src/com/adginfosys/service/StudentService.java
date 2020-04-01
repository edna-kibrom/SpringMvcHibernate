package com.adginfosys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adginfosys.model.Student;
@Service
public interface StudentService {
  
  List<Student> listAll();
}
