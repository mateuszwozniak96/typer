package com.wat.typer.typer.repositories;

import com.wat.typer.typer.entities.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BetRepository extends JpaRepository<Bet, Integer> {

    List<Bet> findByMatchMatchId(int id);
    List<Bet> findByMembershipMembershipId(int id);

}
