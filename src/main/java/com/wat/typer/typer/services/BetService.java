package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Bet;
import com.wat.typer.typer.repositories.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {
    @Autowired
    private BetRepository betRepository;

    public List<Bet> getBets() {
        return betRepository.findAll();
    }

    public void addBet(Bet bet) {
        betRepository.save(bet);
    }
}
