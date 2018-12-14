package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Match;
import com.wat.typer.typer.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping("/matches")
    private List<Match> getMatches(){
        return matchService.getMatches();
    }

    @PostMapping("/matches")
    private void addMatch(@RequestBody Match match){
        matchService.addMatch(match);
    }

    @GetMapping("/matches/{id}")
    public Match getMatch(@PathVariable int id) {
        return matchService.getMatch(id);
    }

    @GetMapping("/queues/{id}/matches")
    public List<Match> getMatchesByQueue(@PathVariable int id) {
        return matchService.getMatchesByQueues(id);
    }

    @PutMapping(value = "/mathces/{id}")
    public void updateMatch(@RequestBody Match match, @PathVariable int id) {
        matchService.addMatch(match);
    }

    @DeleteMapping(value = "/matches/{id}")
    public void deleteLeague(@PathVariable int id) {
        matchService.deleteMatch(id);
    }
}
