package com.student.dao;

import java.util.List;

import com.student.models.Student.Student;

public interface StudentDao {
    void addStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(int id);
    Student searchStudentByName(String name);
    Student searchStudentByEmail(String email);
}