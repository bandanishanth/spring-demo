package com.example.sochdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {
    private StudentRepository studentRepository;

    @Autowired
    public ViewController(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    @RequestMapping("/form")
    public String form(Model model)
    {
        model.addAttribute("student",new Student());
        return "form";
    }

    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public String create(Model model, @ModelAttribute("student") Student student)
    {
        studentRepository.save(student);
        return "success";
    }
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getAllStudents(Model model)
    {
        model.addAttribute("students",studentRepository.findAll());
        return "result";
    }
    @RequestMapping(value = "/findByName",method = RequestMethod.GET)
    public String getStudentsByName(@RequestParam(name = "studentName") final String studentName, Model model)
    {
        model.addAttribute("students",studentRepository.findAllByStudentNameEquals(studentName));
        return "result";
    }
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search()
    {
        return "search";
    }
}
