package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Bet;
import com.wat.typer.typer.repositories.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Bet getBet(int id) {
        return betRepository.findById(id).get();
    }

    public void deleteBet(int id) {
        betRepository.deleteById(id);
    }


    public List<Bet> getBetsByMatches(int id) {
        List<Bet> bets = new ArrayList<>();
        betRepository.findByMatchMatchId(id).forEach(bets::add);
        return bets;
    }

    public List<Bet> getBetsByMembership(int id) {
        List<Bet> bets = new ArrayList<>();
        betRepository.findByMembershipMembershipId(id).forEach(bets::add);
        return bets;
    }
}
