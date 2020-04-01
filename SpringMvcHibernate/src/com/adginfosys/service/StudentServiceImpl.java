package com.adginfosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adginfosys.model.Student;
import com.adginfosys.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepository stuRepo;

@Override
public List<Student> listAll() {
	
	return stuRepo.findAll();
}
}
