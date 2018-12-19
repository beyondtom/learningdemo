package com.tom.mybatisdruid.controller;

import com.tom.mybatisdruid.dto.Student;
import com.tom.mybatisdruid.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentMapper mapper;


    @RequestMapping(path = "/list")
    @ResponseBody
    public String listUser(){
        List<Student> students = this.mapper.listAll();
        System.out.println(students);
        return "success";
    }

    @RequestMapping(path = "/addUser/{name}/{age}")
    @ResponseBody
    public String addUser(@PathVariable String name, @PathVariable int age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        this.mapper.insert(student);
        return "success";
    }
}
