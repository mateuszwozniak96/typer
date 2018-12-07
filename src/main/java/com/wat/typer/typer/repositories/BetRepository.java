package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet, Integer> {

}
