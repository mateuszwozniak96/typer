package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Integer> {
}
