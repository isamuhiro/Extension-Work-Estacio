package com.estacio.work.extension.app.controllers;


import com.estacio.work.extension.app.exceptions.DepartmentExceptions;
import com.estacio.work.extension.app.exceptions.UserExceptions;
import com.estacio.work.extension.app.models.department.Department;
import com.estacio.work.extension.app.models.department.DepartmentCreate;
import com.estacio.work.extension.app.models.user.User;
import com.estacio.work.extension.app.models.user.UserCreate;
import com.estacio.work.extension.app.services.DepartmentService;
import com.estacio.work.extension.app.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    List<Department> all() {
        return departmentService.findAll();
    }

    @PostMapping("/departments")
    Department newEmployee(@RequestBody DepartmentCreate departmentCreate) {
        return departmentService.create(departmentCreate);
    }

    @GetMapping("/departments/{id}")
    Department one(@PathVariable Long id) throws DepartmentExceptions {
        return departmentService.findById(id)
                .orElseThrow(DepartmentExceptions::new);
    }

    @DeleteMapping("/departments/{id}")
    void deleteEmployee(@PathVariable Long id) {
        departmentService.deleteById(id);
    }
}
