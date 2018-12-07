package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Queue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QueueRepository extends JpaRepository<Queue, Integer> {
}
