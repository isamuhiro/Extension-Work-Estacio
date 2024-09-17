package com.estacio.work.extension.app.models.user;
import com.estacio.work.extension.app.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class UserCreate extends UserBase {
    private String name;
    private String email;
    private String password;
    private Long departmentId;

    public UserEntity toUserEntity() {
        UserEntity user = new UserEntity();
        user.setNome(getName());
        user.setEmail(getEmail());
        user.setSenha(getPassword());
        user.setDepartamentoId(getDepartmentId());
        return user;
    }
}
