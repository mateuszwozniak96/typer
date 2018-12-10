package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Match;
import com.wat.typer.typer.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Match getMatch(int id) {
        return matchRepository.findById(id).get();
    }

    public void deleteMatch(int id) {
        matchRepository.deleteById(id);
    }

    public List<Match> getMatchesByQueues(int id) {
        List<Match> matches = new ArrayList<>();
        matchRepository.findByQueueQueueId(id).forEach(matches::add);
        return matches;
    }
}
