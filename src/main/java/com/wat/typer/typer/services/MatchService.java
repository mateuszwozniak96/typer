package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Match;
import com.wat.typer.typer.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getMatches() {
        return matchRepository.findAll();
    }

    public void addMatch(Match match) {
        matchRepository.save(match);
    }
}
