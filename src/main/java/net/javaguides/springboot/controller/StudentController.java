package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
      // whenever client want to call restAPI -> http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(1,"Robin","cook");
        return student;
    }
    @GetMapping("students")
    // http://localhost:8080/students
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Robin","cook"));
        students.add(new Student(2,"Aman","Negi"));
        students.add(new Student(3,"Avnish","Mishra"));
        students.add(new Student(4,"Ansh","Singh"));
        return students;
    }
    //Spring Boot REST API with path variable
    //http://localhost:8080/students/1/Kumar/Robin
    @GetMapping("students/{id}/{first-name}/{last-name}") // -> id = URI template variable
    public Student studentPathVariable(@PathVariable("id") int studentid,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        return new Student(studentid, firstName, lastName);
    }
}
