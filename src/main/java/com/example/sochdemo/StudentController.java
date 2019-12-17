package com.example.sochdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {this.studentRepository=studentRepository;}

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Student create(@RequestBody Student student)
    {
        studentRepository.save(student);
        return student;
    }
    @RequestMapping(value = "/clear",method = RequestMethod.GET)
    public String delete()
    {
        studentRepository.deleteAll();
        return "Repository Cleared";
    }
}