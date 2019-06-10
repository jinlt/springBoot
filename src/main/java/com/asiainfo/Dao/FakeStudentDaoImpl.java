package com.asiainfo.Dao;

import com.asiainfo.Entity.Student;

import java.util.Collection;

public interface FakeStudentDaoImpl {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudentToDb(Student student);
}
