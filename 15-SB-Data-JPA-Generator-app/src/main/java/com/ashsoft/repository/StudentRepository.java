package com.ashsoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashsoft.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
