package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {
}
