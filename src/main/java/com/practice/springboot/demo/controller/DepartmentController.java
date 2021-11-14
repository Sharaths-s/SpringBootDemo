package com.practice.springboot.demo.controller;

import com.practice.springboot.demo.entity.Department;
import com.practice.springboot.demo.service.DepartmentService;
import com.practice.springboot.demo.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody  Department department){
        return departmentService.saveDepartment(department);

    }

}
