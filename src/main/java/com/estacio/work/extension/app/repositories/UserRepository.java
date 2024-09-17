package com.estacio.work.extension.app.repositories;

import com.estacio.work.extension.app.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
