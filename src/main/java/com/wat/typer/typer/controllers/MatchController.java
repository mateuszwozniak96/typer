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
}
