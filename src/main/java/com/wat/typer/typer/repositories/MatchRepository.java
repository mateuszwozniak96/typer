package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    List<Match> findByQueueQueueId(int id);
}
