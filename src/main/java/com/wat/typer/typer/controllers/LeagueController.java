package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.League;
import com.wat.typer.typer.services.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/leagues/{id}")
    public League getLeague(@PathVariable int id) {
        return leagueService.getLeague(id);
    }

    @PutMapping(value = "/leagues/{id}")
    public void updateLeague(@RequestBody League league, @PathVariable int id) {
        leagueService.addLeague(league);
    }

    @DeleteMapping(value = "/leagues/{id}")
    public void deleteLeague(@PathVariable int id) {
        leagueService.deleteLeague(id);
    }
    @GetMapping(value = "/leagues", params = "name")
    public League getLeagueByName(@RequestParam String name){
        return this.leagueService.getLeagueByName(name);
    }

}
