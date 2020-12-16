package com.ashsoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashsoft.binding.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
