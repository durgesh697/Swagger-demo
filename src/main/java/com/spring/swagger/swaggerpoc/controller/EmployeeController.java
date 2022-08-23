package com.spring.swagger.swaggerpoc.controller;

import com.spring.swagger.swaggerpoc.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "SwaggerRestController")
@RestController
class SwaggerRestController {


    @ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getStudents")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})

    @RequestMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }

    @ApiOperation(value = "Get specific Student in the System ", response = Student.class, tags = "getStudent")
    @RequestMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name") String name) {
        return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }

    List<Student> students = new ArrayList<Student>();

    {
        students.add(new Student("Tom", "IV", "USA"));
        students.add(new Student("Harry", "V", "UK"));
    }
}
