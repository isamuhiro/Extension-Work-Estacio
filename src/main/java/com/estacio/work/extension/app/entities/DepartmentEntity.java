package com.estacio.work.extension.app.entities;


import com.estacio.work.extension.app.models.department.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "departamento")
@NoArgsConstructor
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;


    public Department toDepartment() {
        return Department.builder().id(id).name(nome).build();
    }

}
