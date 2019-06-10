package com.asiainfo.Dao;

import com.asiainfo.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao implements FakeStudentDaoImpl {

  private static Map<Integer, Student> students;

  static {
    students = new HashMap<Integer, Student>() {
      {
        put(1, new Student(1, "Jinlt", "Math"));
        put(2, new Student(2, "zhengcf", "Chinese"));
        put(3, new Student(3, "Zhaotz", "History"));
      }
    };
  }

  @Override
  public Collection<Student> getAllStudents() {
    return this.students.values();
  }

  @Override
  public Student getStudentById(int id) {
    return this.students.get(id);
  }

  @Override
  public void removeStudentById(int id) {
    this.students.remove(id);
  }

  @Override
  public void updateStudentById(Student student) {
    Student s = students.get(student.getId());
    s.setName(student.getName());
    s.setCourse(student.getCourse());
    students.put(student.getId(), student);
  }

  @Override
  public void insertStudentToDb(Student student) {
    this.students.put(student.getId(), student);
  }

}
