package com.estacio.work.extension.app.models.department;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Department extends DepartmentBase {
    private Long id;
}
