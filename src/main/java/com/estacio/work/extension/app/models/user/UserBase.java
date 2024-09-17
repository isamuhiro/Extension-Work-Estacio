package com.estacio.work.extension.app.models.user;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class UserBase {
    private String name;
    private String email;
    private String password;
    private Long departmentId;
}
