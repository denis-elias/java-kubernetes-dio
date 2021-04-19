package com.example.javakubernetes.persistence;

import com.example.javakubernetes.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
