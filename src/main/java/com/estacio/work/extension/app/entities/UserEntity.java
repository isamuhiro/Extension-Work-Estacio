package com.estacio.work.extension.app.entities;


import com.estacio.work.extension.app.models.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "usuario")
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "departamento_id")
    private Long departamentoId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    public User toUser() {
        return User.builder()
                .id(id)
                .departmentId(departamentoId)
                .email(email)
                .password(senha)
                .name(nome)
                .build();
    }

}
