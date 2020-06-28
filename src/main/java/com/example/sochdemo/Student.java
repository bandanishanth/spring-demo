package com.example.sochdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String studentName;
    private String section;

    public Student(){}

    public Student(String studentName, String section) {
        this.studentName = studentName;
        this.section = section;
    }

    public long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSection() {
        return section;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
