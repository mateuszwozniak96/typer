package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
