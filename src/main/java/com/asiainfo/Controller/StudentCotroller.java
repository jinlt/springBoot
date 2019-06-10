package com.asiainfo.Controller;

import com.asiainfo.Entity.Student;
import com.asiainfo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentCotroller {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return this.studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
        this.studentService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentById(@RequestBody Student student) {
        this.studentService.updateStudentById(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudentById(@RequestBody Student student) {
        this.studentService.insertStudentById(student);
    }
}
