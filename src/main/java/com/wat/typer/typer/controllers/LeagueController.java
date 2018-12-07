package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.League;
import com.wat.typer.typer.services.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {
    @Autowired
    private LeagueService leagueService;

    @GetMapping("/leagues")
    private List<League> getLeagues(){
        return leagueService.getLeagues();
    }
    @PostMapping("/leagues")
    private void addLeague(@RequestBody League league){
        leagueService.addLeague(league);
    }
}
