package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Match;
import com.wat.typer.typer.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
}
