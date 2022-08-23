package com.spring.swagger.swaggerpoc.model;

import io.swagger.annotations.ApiModelProperty;

public class Student {


    //    @ApiModelProperty(notes = "Name of the Student", name = "name", required = true, value = "test name")
    private String name;
    //    @ApiModelProperty(notes = "Class of the Student", name = "cls", required = true, value = "test class")
    private String cls;
    //    @ApiModelProperty(notes = "Country of the Student", name = "country", required = true, value = "test country")
    private String country;

    public Student(String name, String cls, String country) {
        super();
        this.name = name;
        this.cls = cls;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCls() {
        return cls;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
    }

}
