package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {
    List<Membership> findByLeagueLeagueId(int id);

    List<Membership> findByUserUserId(int id);
}
