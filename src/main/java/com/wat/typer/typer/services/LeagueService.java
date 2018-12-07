package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.League;
import com.wat.typer.typer.repositories.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {
    @Autowired
    private LeagueRepository leagueRepository;

    public List<League> getLeagues() {
        return leagueRepository.findAll();
    }

    public void addLeague(League league) {
        leagueRepository.save(league);
    }
}
