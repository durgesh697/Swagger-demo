package com.spring.swagger.swaggerpoc.controller;

import com.spring.swagger.swaggerpoc.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(value = "SwaggerRestController")
@RestController
class SwaggerRestController {


    @ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getStudents")
    @RequestMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }

    @ApiOperation(value = "Add Student details in the System ", response = Iterable.class, tags = "addStudent")
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, headers = "Accept=application/json")
    public Student addStudent(@RequestBody Student student) {
        Student studentDetail = new Student("Jack", "10", "UK");
        return studentDetail;
    }

    List<Student> students = new ArrayList<Student>();

    {
        students.add(new Student("Tom", "IV", "USA"));
        students.add(new Student("Harry", "V", "UK"));
    }
}
