package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;


public interface QueueRepository extends JpaRepository<Queue, Integer> {
    List<Queue> findByLeagueLeagueId(int id);
}
