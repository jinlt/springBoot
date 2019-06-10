package com.asiainfo.Service;

import com.asiainfo.Dao.StudentDao;
import com.asiainfo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudentById(Student student) {
        this.studentDao.updateStudentById(student);
    }

    public void insertStudentById(Student student) {
        this.studentDao.insertStudentToDb(student);
    }


}
