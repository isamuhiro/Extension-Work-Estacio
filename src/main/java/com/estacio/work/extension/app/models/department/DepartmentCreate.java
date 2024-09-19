package com.estacio.work.extension.app.models.department;
import com.estacio.work.extension.app.entities.DepartmentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class DepartmentCreate extends DepartmentBase {
    public DepartmentEntity toDepartmentEntity() {
        DepartmentEntity department = new DepartmentEntity();
        department.setNome(getName());
        return department;
    }
}
