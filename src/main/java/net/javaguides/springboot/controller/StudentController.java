package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
      // whenever client want to call restAPI -> //http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(1,"Robin","cook");
        return student;
    }
}
