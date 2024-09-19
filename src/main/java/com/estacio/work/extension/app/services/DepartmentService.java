package com.estacio.work.extension.app.services;


import com.estacio.work.extension.app.entities.DepartmentEntity;
import com.estacio.work.extension.app.entities.UserEntity;
import com.estacio.work.extension.app.models.department.Department;
import com.estacio.work.extension.app.models.department.DepartmentBase;
import com.estacio.work.extension.app.models.department.DepartmentCreate;
import com.estacio.work.extension.app.models.user.User;
import com.estacio.work.extension.app.models.user.UserCreate;
import com.estacio.work.extension.app.repositories.DepartmentRepository;
import com.estacio.work.extension.app.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department create(DepartmentCreate department) {
        return departmentRepository.save(department.toDepartmentEntity()).toDepartment();
    }

    public List<Department> findAll() {
        return departmentRepository.findAll().stream().map(DepartmentEntity::toDepartment).toList();
    }

    public Optional<Department> findById(Long id) {
        Optional<DepartmentEntity> existingDepartment = departmentRepository.findById(id);
        return existingDepartment.map(DepartmentEntity::toDepartment);
    }

    public void deleteById(Long id) {
        Optional<DepartmentEntity> existingUser = departmentRepository.findById(id);
        if (existingUser.isEmpty()) {
            throw new EntityNotFoundException();
        }
        departmentRepository.deleteById(id);
    }
}
