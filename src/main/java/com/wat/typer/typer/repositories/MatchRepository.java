package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}
